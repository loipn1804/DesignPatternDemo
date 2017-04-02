package liophan.designpatterndemo.other.reflection;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import liophan.designpatterndemo.R;
import liophan.designpatterndemo.model.User;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 30, 2017
 */

public class ReflectionActivity extends AppCompatActivity {

    @BindView(R.id.btnAction)
    Button btnAction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        ButterKnife.bind(this);

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                action1();
//                constructor();
                getUserInfo();
            }
        });
    }

    private void action1() {
        String log = "";
        Class ufoEnemyShip = UFOEnemyShip.class;
        log += "class name: " + ufoEnemyShip.getName() + "\n";
        log += "class getSimpleName: " + ufoEnemyShip.getSimpleName() + "\n";
        log += "class getCanonicalName: " + ufoEnemyShip.getCanonicalName() + "\n";
        int classModifier = ufoEnemyShip.getModifiers();
        if (Modifier.isPublic(classModifier)) {
            log += "classModifier: isPublic" + "\n";
        }
        if (Modifier.isAbstract(classModifier)) {
            log += "classModifier: isAbstract" + "\n";
        }
        if (Modifier.isPrivate(classModifier)) {
            log += "classModifier: isPrivate" + "\n";
        }
        if (Modifier.isFinal(classModifier)) {
            log += "classModifier: isFinal" + "\n";
        }
        if (Modifier.isInterface(classModifier)) {
            log += "classModifier: isInterface" + "\n";
        }

        log += "getDeclaringClass " + (ufoEnemyShip.getDeclaringClass() != null ? ufoEnemyShip.getDeclaringClass().getSimpleName() : "null") + "\n";
        log += "getEnclosingClass " + (ufoEnemyShip.getEnclosingClass() != null ? ufoEnemyShip.getEnclosingClass().getSimpleName() : "null") + "\n";
        log += "getSuperclass " + (ufoEnemyShip.getSuperclass() != null ? ufoEnemyShip.getSuperclass().getSimpleName() : "null") + "\n";
        log += getClassParent(ufoEnemyShip) + "\n";
//        log += getClassMethod(ufoEnemyShip) + "\n";

        log += "===================================================\n";

        Log.e("LIO", log);
    }

    private String getClassParent(Class aClass) {
        if (aClass.getSuperclass() == null) {
            return "";
        } else {
            return aClass.getSimpleName() + "/" + getClassParent(aClass.getSuperclass());
        }
    }

    private String getClassMethod(Class aClass) {
        String result = "";
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            String params = "";
            for (Class param : method.getParameterTypes()) {
                params += param.getSimpleName() + " | ";
            }
            result += method.getName() + ": " + params + "\n";
        }
        return result;
    }

    private void constructor() {
        Class reflectClass = UFOEnemyShip.class;

        Constructor constructor = null;

        Object obj = null;

        try {
            constructor = reflectClass.getConstructor(new Class[]{EnemyShipFactory.class});

            obj = reflectClass.getConstructor(int.class, String.class).newInstance(10, "LIO");

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Class[] constructorParameters = constructor.getParameterTypes();

        for (Class parameter : constructorParameters) {
            Log.e("LIO", "parameter getSimpleName:" + parameter.getSimpleName());
        }

        UFOEnemyShip newEnemyShip = null;

        EnemyShipFactory enemyShipFactory = null;

        try {
            newEnemyShip = (UFOEnemyShip) constructor.newInstance(enemyShipFactory);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        newEnemyShip.setName("X-LIO");

        Log.e("LIO", "newEnemyShip getName:" + newEnemyShip.getName());

        Field privateStringName = null;

        UFOEnemyShip enemyShipPrivate = new UFOEnemyShip(enemyShipFactory);

        try {
            privateStringName = reflectClass.getDeclaredField("mIdCode");

            privateStringName.setAccessible(true);

            try {
                String value = (String) privateStringName.get(enemyShipPrivate);

                Log.e("LIO", "private mIdCode:" + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void getUserInfo() {
        Random random = new Random();
        User user = new User(random.nextInt(10) + 1, "name" + (random.nextInt(1000) + 100), random.nextInt(50) + 10);

        Field idField = null;
        Field nameField = null;
        Field ageField = null;
        try {
            idField = User.class.getDeclaredField("id");
            nameField = User.class.getDeclaredField("name");
            ageField = User.class.getDeclaredField("age");

            idField.setAccessible(true);
            nameField.setAccessible(true);
            ageField.setAccessible(true);

            int id = (int) idField.get(user);
            String name = (String) nameField.get(user);
            int age = (int) ageField.get(user);

            Log.e("LIO", "user: id=" + id + ", name=" + name + ", age=" + age);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Method merge = null;

        try {
            merge = User.class.getDeclaredMethod("merge");

            merge.setAccessible(true);

            String mergeValue = (String) merge.invoke(user, null);
            Log.e("LIO", "method " + merge.getName() + ": " + mergeValue);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Method change = null;

        try {
            Class[] paramsClass = new Class[] {String.class, int.class};
            Object[] params = new Object[]{"LIO", 5};

            change = User.class.getDeclaredMethod("change", paramsClass);

            change.setAccessible(true);

            String changeValue = (String) change.invoke(user, params);
            Log.e("LIO", "method " + change.getName() + ": " + changeValue);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

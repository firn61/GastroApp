package ru.med.gastroapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.med.gastroapp.config.AppConfiguration;

public class Runner {
        public static void main(String[] args) {
            AnnotationConfigApplicationContext context = null;
            try {
                context = new AnnotationConfigApplicationContext(AppConfiguration.class);
                GastroApplication application = context.getBean(GastroApplication.class);

                application.testTask();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                context.close();
            }
        }
    }


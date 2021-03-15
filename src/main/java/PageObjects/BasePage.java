package PageObjects;

import com.codeborne.selenide.Condition;

public abstract class BasePage {

    abstract void load();

        abstract void isLoaded();

        static Condition clickable = Condition.and("can be clicked", Condition.appear, Condition.visible, Condition.enabled);
        public void get() {
            System.out.println("------inside get() base page--------");

            try {
                System.out.println("------inside try() base page--------");

                isLoaded();
            }
            catch (Exception e) {
                System.out.println("------inside catch() base page--------");

                load();
            }
            finally {
                System.out.println("------inside finally() base page--------");

                isLoaded();
            }
        }
    }


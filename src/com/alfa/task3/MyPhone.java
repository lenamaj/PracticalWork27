package com.alfa.task3;


import com.alfa.task12.MyPhoneBookold;

public class MyPhone {

    MyPhoneBook phoneBook;
    public MyPhone() {
        this.phoneBook = new MyPhoneBook();
    }

    class MyPhoneBook {

        private MyPhoneBook.PhoneRecord[] phoneRecords = new MyPhoneBook.PhoneRecord[10];
        private int count;

        class PhoneRecord {
            String name;
            String phone;

            public PhoneRecord(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            @Override
            public String toString() {
                return
                        "name='" + name + '\'' +
                                ", \tphone='" + phone;
            }


        }

        public void addPhoneNumber(String name, String phone) {

            phoneRecords[count++] = new MyPhoneBook.PhoneRecord(name, phone);
        }

        public void printPhoneBook() {

            for (int i = 0; i < count; i++) {
                System.out.println(phoneRecords[i]);
            }
        }

    }

    public void swichOn() {

        System.out.println("Loading PhoneBook records…");
        phoneBook.addPhoneNumber("Ivan", "06644428653");
        phoneBook.addPhoneNumber("Lena", "0631300973");
        phoneBook.addPhoneNumber("Nastya", "0667262626");
        phoneBook.addPhoneNumber("Olya", "07272272727");
        phoneBook.addPhoneNumber("Kolya", "776773667676");
        phoneBook.addPhoneNumber("Marina", "9877633");
        phoneBook.addPhoneNumber("Sasha", "75656565");
        System.out.println("Loading is complete");
    }


    public void call(int id) {
        if (id < 0 || id > phoneBook.count) {
            System.out.println("Number does not exist");
        }
        System.out.println("Calling to " + phoneBook.phoneRecords[id]);
    }

}



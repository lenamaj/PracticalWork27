package com.alfa.task12;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBookold {

    private PhoneRecord[] phoneRecords = new PhoneRecord[10];
    private int count;

    public class PhoneRecord{
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

    public void addPhoneNumber(String name, String phone){

        phoneRecords[count++]= new PhoneRecord(name, phone);
    }

    public void printPhoneBook(){

        for (int i = 0; i < count; i++) {
            System.out.println(phoneRecords[i]);
        }
    }


    //2
/*

    public void sortByName(){
        Arrays.sort(phoneRecords, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                PhoneRecord pr1 = (PhoneRecord) o1;
                PhoneRecord pr2 = (PhoneRecord) o2;
                return compare(pr1.name , pr2.name);
            }
        });
    }
*/

/*
  public void sortByPhone(){
        Arrays.sort(phoneRecords, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                String phone1 = ((PhoneRecord) o1).getPhone();
                String phone2 = ((PhoneRecord) o2).getPhone();
                return phone1.compareTo(phone2);
            }
        });
    }
*/






}

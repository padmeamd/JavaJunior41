package lesson6;
// Написать программу(базу для хранения) для туров, которая будет включать важную информацию по турам и сможет ее сортировать.
// порядковый номер тура, цена, самолет, кол-во дней, перелет, цена, кол-во звезд, город, завтрак
// при помощи 2Д массива, туры будем добавлять вручную

import java.util.Scanner;

public class ToursProgram {
        public static void main(String[] args) {
                String[][] toursInfo = new String[100][8]; // массив : 8 колонок, 100 вариантов туров
                TourUtils.addTour("United Arabian Emirates", "Dubai","plane",
                        "14 days", "200000 rub", "4 stars hotel","Breakfast",toursInfo);

                TourUtils.addTour("United Arabian Emirates", "Abu Dhabi","plane",
                        "7 days", "120000 rub", "5 stars hotel ","Breakfast",toursInfo);

                TourUtils.addTour("Italy", "Rome","plane",
                        "5 days", "240000 rub", "3 stars hotel","None",toursInfo);

                TourUtils.addTour("France", "Nice","plane",
                        "4 days", "130000 rub", "2 stars","None",toursInfo);

                TourUtils.addTour("France", "Paris","plane",
                        "3 days", "90000 rub", "2 stars","Breakfast",toursInfo);

                TourUtils.addTour("United Kingdom", "London","plane",
                        "14 days", "170000 rub", "3 stars hotel","Dinner",toursInfo);

                TourUtils.addTour("United States", "Los Angeles","plane",
                        "14 days", "1000000 rub", "4 stars hotel","Breakfast + Dinner",toursInfo);

                TourUtils.addTour("Russia", "Kazan","train",
                        "14 days", "100000 rub", "5 stars hotel","Breakfast + Dinner",toursInfo);

                TourUtils.addTour("Russia", "Saint Petersburg","train",
                        "7 days", "70000 rub", "2 stars hotel","Breakfast",toursInfo);

                TourUtils.addTour("Finland", "Helsinki","train",
                        "3 days", "110000 rub", "2 stars hotel","Breakfast",toursInfo);

                ScannerUtils.searchByDays(toursInfo); // выводит на консоль туры по дням
                final var countries = ScannerUtils.searchByCountry(toursInfo); // выводит туры по стране и бюджету
                ScannerUtils.searchByBudget(countries);
                final var transportTypes = ScannerUtils.searchByTransport(toursInfo); // выводит туры по стране и бюджету
                ScannerUtils.searchByStars(transportTypes);




                /** создать методы:
                 * 1) вывести на консоль туры  с фильтром по дням (На сколько дней?)
                 * 2) вывести на консоль туры  по количеству звезд и каким транспортом
                 * 3) вывести на консоль туры : страны и бюджет(вместе одним методом)
                 */
        }
}

package BurcBulanProgram;

/*
    Koç Burcu : 21 Mart - 20 Nisan
    Boğa Burcu : 21 Nisan - 21 Mayıs
    İkizler Burcu : 22 Mayıs - 22 Haziran
    Yengeç Burcu : 23 Haziran - 22 Temmuz
    Aslan Burcu : 23 Temmuz - 22 Ağustos
    Başak Burcu : 23 Ağustos - 22 Eylül
    Terazi Burcu : 23 Eylül - 22 Ekim
    Akrep Burcu : 23 Ekim - 21 Kasım
    Yay Burcu : 22 Kasım - 21 Aralık
    Oğlak Burcu : 22 Aralık - 21 Ocak
    Kova Burcu : 22 Ocak - 19 Şubat
    Balık Burcu : 20 Şubat - 20 Mart
 */

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int month, day;
        String zodiac = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz Gün : ");
        day = input.nextInt();


        switch (month) {
            case 1:
                if(day >= 1 && day <= 31) {
                    if (day < 22) {
                        zodiac = "Oğlak";
                    } else {
                        zodiac = "Kova";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if(day >= 1 && day <= 28) {
                    if (day < 20) {
                        zodiac = "Kova";
                    } else {
                        zodiac = "Balık";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if(day >= 1 && day <= 31) {
                    if (day < 21) {
                        zodiac = "Balık";
                    } else {
                        zodiac = "Koç";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if(day >= 1 && day <= 30) {
                    if (day < 21) {
                        zodiac = "Koç";
                    } else {
                        zodiac = "Boğa";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if(day >= 1 && day <= 31) {
                    if (day < 21) {
                        zodiac = "Boğa";
                    } else {
                        zodiac = "İkizler";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if(day >= 1 && day <= 30) {
                    if (day < 22) {
                        zodiac = "İkizler";
                    } else {
                        zodiac = "Yengeç";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if(day >= 1 && day <= 31) {
                    if (day < 22) {
                        zodiac = "Yengeç";
                    } else {
                        zodiac = "Aslan";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if(day >= 1 && day <= 31) {
                    if (day < 23) {
                        zodiac = "Aslan";
                    } else {
                        zodiac = "Başak";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if(day >= 1 && day <= 30) {
                    if (day < 23) {
                        zodiac = "Başak";
                    } else {
                        zodiac = "Terazi";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if(day >= 1 && day <= 31) {
                    if (day < 23) {
                        zodiac = "Terazi";
                    } else {
                        zodiac = "Akrep";
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if(day >= 1 && day <= 30) {
                    if (day < 22) {
                        zodiac = "Akrep";
                    } else {
                        zodiac = "Yay";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if(day >= 1 && day <= 31) {
                    if (day < 22) {
                        zodiac = "Yay";
                    } else {
                        zodiac = "Oğlak";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }

        if(isError) {
            System.out.println("Hatalı Giriş Yaptınız.");
        } else {
            System.out.println("Burcunuz : " + zodiac);
        }
    }
}

package com.example.menu;

import java.util.ArrayList;

public class MenuData {

    private static String[] menuName = {
            "Nasi Bakar",
            "Sate Usus",
            "Sate Bakso",
            "Gorengan",
            "Es Teh"

    };

    private static String [] menuDetail = {
            "Nasi dibungkus daun pisang lalu dibakar. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            "Usus yang dibuat sate. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            "Bakso yang dibuat sate. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            "Tahu,tempe,bakwan goreng. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            "Teh yang diberi es. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."

    };

    private static int [] menuImage = {
            R.drawable.nasi_bakar,
            R.drawable.sate_usus,
            R.drawable.sate_bakso,
            R.drawable.gorengan,
            R.drawable.esteh,

    };

    static ArrayList<Menu> getListData(){
        ArrayList<Menu> list = new ArrayList<>();
        for(int position = 0; position <menuName.length; position++){
            Menu menu = new Menu();
            menu.setName(menuName[position]);
            menu.setDetail(menuDetail[position]);
            menu.setPhoto(menuImage[position]);
            list.add(menu);
        }
        return list;
    };
}

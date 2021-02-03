package com.example.cesar

class calcular (var pass: String, val opcion: Int){

    operator fun invoke(): String {
        var pass= pass
        var finalpass: String

        finalpass = diccionario(pass)
        return finalpass
    }

    fun diccionario(pass: String):String{
        var final = "Error"
        var aux = "Error"
        var contador: Int
        var compara = pass
        var tamano = compara.length
        var auxNull: Char
        var separadaChar = arrayOfNulls<Char>(tamano)
        var separada = arrayOfNulls<String>(tamano)

        var palabra = Array(2) { arrayOfNulls<String>(55) }
        palabra[0][0] = "A"//principal
        palabra[1][0] = "D"
        palabra[0][1] = "B"//principal
        palabra[1][1] = "E"
        palabra[0][2] = "C"//principal
        palabra[1][2] = "F"
        palabra[0][3] = "D"//principal
        palabra[1][3] = "G"
        palabra[0][4] = "E"//principal
        palabra[1][4] = "H"
        palabra[0][5] = "F"//principal
        palabra[1][5] = "I"
        palabra[0][6] = "G"//principal
        palabra[1][6] = "J"
        palabra[0][7] = "H"//principal
        palabra[1][7] = "K"
        palabra[0][8] = "I"//principal
        palabra[1][8] = "L"
        palabra[0][9] = "J"//principal
        palabra[1][9] = "M"
        palabra[0][10] = "K"//principal
        palabra[1][10] = "N"
        palabra[0][11] = "L"//principal
        palabra[1][11] = "O"
        palabra[0][12] = "M"//principal
        palabra[1][12] = "P"
        palabra[0][13] = "N"//principal
        palabra[1][13] = "Q"
        palabra[0][14] = "Ñ"//principal
        palabra[1][14] = "Ñ"
        palabra[0][15] = "O"//principal
        palabra[1][15] = "R"
        palabra[0][16] = "P"//principal
        palabra[1][16] = "S"
        palabra[0][17] = "Q"//principal
        palabra[1][17] = "T"
        palabra[0][18] = "R"//principal
        palabra[1][18] = "U"
        palabra[0][19] = "S"//principal
        palabra[1][19] = "V"
        palabra[0][20] = "T"//principal
        palabra[1][20] = "W"
        palabra[0][21] = "U"//principal
        palabra[1][21] = "X"
        palabra[0][22] = "V"//principal
        palabra[1][22] = "Y"
        palabra[0][23] = "W"//principal
        palabra[1][23] = "Z"
        palabra[0][24] = "X"//principal
        palabra[1][24] = "A"
        palabra[0][25] = "Y"//principal
        palabra[1][25] = "B"
        palabra[0][26] = "Z"//principal
        palabra[1][26] = "C"
        palabra[0][27] = "a"//principal
        palabra[1][27] = "d"
        palabra[0][28] = "b"//principal
        palabra[1][28] = "e"
        palabra[0][29] = "c"//principal
        palabra[1][29] = "f"
        palabra[0][30] = "d"//principal
        palabra[1][30] = "g"
        palabra[0][31] = "e"//principal
        palabra[1][31] = "h"
        palabra[0][32] = "f"//principal
        palabra[1][32] = "i"
        palabra[0][33] = "g"//principal
        palabra[1][33] = "j"
        palabra[0][34] = "h"//principal
        palabra[1][34] = "k"
        palabra[0][35] = "i"//principal
        palabra[1][35] = "l"
        palabra[0][36] = "j"//principal
        palabra[1][36] = "m"
        palabra[0][37] = "k"//principal
        palabra[1][37] = "n"
        palabra[0][38] = "l"//principal
        palabra[1][38] = "o"
        palabra[0][39] = "m"//principal
        palabra[1][39] = "p"
        palabra[0][40] = "n"//principal
        palabra[1][40] = "q"
        palabra[0][41] = "ñ"//principal
        palabra[1][41] = "ñ"
        palabra[0][42] = "o"//principal
        palabra[1][42] = "r"
        palabra[0][43] = "p"//principal
        palabra[1][43] = "s"
        palabra[0][44] = "q"//principal
        palabra[1][44] = "t"
        palabra[0][45] = "r"//principal
        palabra[1][45] = "u"
        palabra[0][46] = "s"//principal
        palabra[1][46] = "v"
        palabra[0][47] = "t"//principal
        palabra[1][47] = "w"
        palabra[0][48] = "u"//principal
        palabra[1][48] = "x"
        palabra[0][49] = "v"//principal
        palabra[1][49] = "y"
        palabra[0][50] = "w"//principal
        palabra[1][50] = "z"
        palabra[0][51] = "x"//principal
        palabra[1][51] = "a"
        palabra[0][52] = "y"//principal
        palabra[1][52] = "b"
        palabra[0][53] = "z"//principal
        palabra[1][53] = "c"
        palabra[0][54] = " "//principal
        palabra[1][54] = " "

        for (i in 0 until   tamano) {
            separada[i] = compara.substring(i,i+1)
            separadaChar[i] = compara[i]
            auxNull = separadaChar[i]!!
            if(auxNull.toInt() != 32){
                if((auxNull.toInt() < 65) || (auxNull.toInt() > 123)) {
                    if ((auxNull.toInt() < 90) || (auxNull.toInt() > 97)) {
                        return final
                    }
                }
            }
        }

        for (i in 0 until tamano) {
            contador = 0
            while(contador <= 55) {
                if (opcion == 1) {
                    if (separada[i] == palabra[0][contador]) {
                        separada[i] = palabra[1][contador]
                        contador = 55
                    }
                }else{
                    if (separada[i] == palabra[1][contador]) {
                        separada[i] = palabra[0][contador]
                        contador = 55
                    }
                }
                contador+=1
            }
        }

        final = separada[0].toString()
        for (i in 1 until tamano) {
            aux = separada[i].toString()
            final = "$final$aux"
        }
        return final
    }
}
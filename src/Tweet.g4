grammar Tweet;
r : (URL|ARROBA|HASHTAG|FINAL|ALPHA|SIGNOS)+;

S : [\r\t] -> skip;

//-------------------------------------------------------------------------------------------------------------
//url
URL : 'http://www.'ALPHA+'.'ALPHA+ {
    if(caracteres<140){
        if((140-caracteres) > getText().length()){
            System.out.print("<SPAN CLASS=" + '"' + "link" + '"' + ">" + getText() + "</SPAN>");
            caracteres += getText().length();
        }
        else{
            System.out.print("<SPAN CLASS=" + '"' + "link" + '"' + ">");
            for(int i = 0; i<(141-caracteres); i++){
                System.out.print(getText().charAt(i));
            }
            System.out.print("</SPAN>");
            System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
            for(int k = (141-caracteres); k<getText().length(); k++){
                System.out.print(getText().charAt(k));
            }
            System.out.print("</SPAN>");
        }
    }
    else{
        System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
        for(int j = (140-caracteres); j<getText().length(); j++){
            System.out.print(getText().charAt(j));
        }
        System.out.print("</SPAN>");
    }
};

//Arroba
ARROBA : '@'ALPHA+ {
    if(caracteres<140){
        if((140-caracteres) > getText().length()){
            System.out.print("<SPAN CLASS=" + '"' + "usr" + '"' + ">" + getText() + "</SPAN>");
            caracteres += getText().length();
        }
        else{
            System.out.print("<SPAN CLASS=" + '"' + "usr" + '"' + ">");
            for(int i = 0; i<(141-caracteres); i++){
                System.out.print(getText().charAt(i));
            }
            System.out.print("</SPAN>");
            System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
            for(int k = (141-caracteres); k<getText().length(); k++){
                System.out.print(getText().charAt(k));
            }
            System.out.print("</SPAN>");
        }
    }
    else{
        System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
        for(int j = (140-caracteres); j<getText().length(); j++){
            System.out.print(getText().charAt(j));
        }
        System.out.print("</SPAN>");
    }
};

//Hashtag
HASHTAG : '#'ALPHA+ {
    if(caracteres<140){
        if((140-caracteres) > getText().length()){
            System.out.print("<SPAN CLASS=" + '"' + "hashtag" + '"' + ">" + getText() + "</SPAN>");
            caracteres += getText().length();
        }
        else{
            System.out.print("<SPAN CLASS=" + '"' + "hashtag" + '"' + ">");
            for(int i = 0; i<(141-caracteres); i++){
                System.out.print(getText().charAt(i));
            }
            System.out.print("</SPAN>");

            System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
            for(int k = (141-caracteres); k<getText().length(); k++){
                System.out.print(getText().charAt(k));
            }
            System.out.print("</SPAN>");
        }
    }
    else{
        System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
        for(int j = (140-caracteres); j<getText().length(); j++){
            System.out.print(getText().charAt(j));
        }
        System.out.print("</SPAN>");
    }
};

//-------------------------------------------------------------------------------------------------------------
//Letras
ALPHA : [a-zA-Z]+ {
    if(caracteres < 140){
        if((140-caracteres) > getText().length()){
            System.out.print(getText());
            caracteres += getText().length();
        }
        else{
            for(int i = 0; i<(141-caracteres); i++){
                System.out.print(getText().charAt(i));
            }

            System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
            for(int k = (141-caracteres); k<getText().length(); k++){
                System.out.print(getText().charAt(k));
            }
            System.out.print("</SPAN>");
        }
    }
    else{
        System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
        for(int j = (140-caracteres); j<getText().length(); j++){
            System.out.print(getText().charAt(j));
        }
        System.out.print("</SPAN>");
    }
};

//Signos
SIGNOS : (' '|','|'.'|'\n') {
    if(caracteres<140){
        if((141-caracteres) >= 1){
            System.out.print(getText());
            caracteres += 1;
        }
    }
    else{
        System.out.print("<SPAN CLASS=" + '"' + "sobrante" + '"' + ">");
        System.out.print(getText());
        System.out.print("</SPAN>");
    }
};

//Final del mensaje
FINAL : '#FIN@';


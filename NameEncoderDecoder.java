class NameEncoderDecoder{
    public String encode(String name){
        return "NOTFORYOU" + name.replaceAll("e","1")
                .replaceAll("u","2")
                .replaceAll("i","3")
                .replaceAll("o","4")
                .replaceAll("a","5") + "YESNOTFORYOU";
    }
    public String decode(String name){
     return name.replaceAll("YESNOTFORYOU","").replaceAll("1","e")
             .replaceAll("2","u")
             .replaceAll("3","i")
             .replaceAll("4","o")
             .replaceAll("5","a")
             .replaceAll("NOTFORYOU","");


    }



    public static void main(String[] args){
        NameEncoderDecoder nameEncoderDecoder = new NameEncoderDecoder();
        System.out.println("encode = " + nameEncoderDecoder.encode("crab"));
        System.out.println("decode = " + nameEncoderDecoder.decode("NOTFORYOUcr5bYESNOTFORYOU"));



    }

}
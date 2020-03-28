package com.lzw.singleton;

/**
 * 懒汉
 * @author zhuwu.long
 * @Date 2020/3/28 19:02
 */
public class LHSingleton {
    private static volatile LHSingleton INSTANCE = null;
    private LHSingleton(){
    }
    public static LHSingleton getInstance(){
        if(INSTANCE == null){
            try{
                Thread.sleep(200);
            }catch (Exception e){
                e.printStackTrace();
            }
            synchronized (LHSingleton.class){
                if(INSTANCE == null) {
                    INSTANCE = new LHSingleton();
                }
            }
        }

        return INSTANCE;
    }

    public static void main(String[] agrs){
        for(int i = 0; i < 100; i++){
            new Thread(
                    () -> {
                        System.out.println(getInstance().hashCode());
                    }
            ).start();
        }
    }
}

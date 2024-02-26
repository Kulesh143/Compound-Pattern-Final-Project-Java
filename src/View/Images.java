/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.db;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */

public class Images {
    private String imgurl;

    public Images(String imgurl) {
        this.imgurl = imgurl;
    }

    /**
     * @return the imgurl
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * @param imgurl the imgurl to set
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
  public void saveMemento(Caretaker c){
      Memento m=new Memento(imgurl);
    c.addMemento(m);
}
public void restoreMemento(Memento m){
    this.imgurl=m.getImgurl();
 
}
static class Memento{
    private String imgurl;

        public Memento(String imgurl) {
            this.imgurl = imgurl;
        }
    

        /**
         * @return the imgurl
         */
        public String getImgurl() {
            return imgurl;
        }
}  
}
class Caretaker{
      private final ArrayList<Images.Memento> mementos=new ArrayList<>();
    public void addMemento(Images.Memento m){
       this.mementos.add(m);
    }
    public Images.Memento getMemento(int index){
        return this.mementos.get(index);
        
    }
}



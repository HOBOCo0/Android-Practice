package com.example.firstapp

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class CustomMenu {
    fun showMenu(context: Context,view: View){
        val pop = PopupMenu(context,view)
        pop.inflate(R.menu.menu)

        pop.setOnMenuItemClickListener {
            when(it!!.itemId){
                R.id.edit-> {Toast.makeText(context,"edit clicked",Toast.LENGTH_LONG).show()
                    true}
                R.id.delete-> {Toast.makeText(context,"delete clicked",Toast.LENGTH_LONG).show()
                    true}
                R.id.share-> {Toast.makeText(context,"share clicked",Toast.LENGTH_LONG).show()
                    true}
                else -> false
            }
        }

        try{

            val fieldMpopup = PopupMenu::class.java.getDeclaredField("mPopup")
            fieldMpopup.isAccessible = true

            val mPopup = fieldMpopup.get(pop)
            mPopup.javaClass
                .getDeclaredMethod("setForceShowIcon", Boolean::class.java)
                .invoke(mPopup,true)
        }
        catch (e:Exception){

        }
        finally {
            pop.show()
        }
    }
}

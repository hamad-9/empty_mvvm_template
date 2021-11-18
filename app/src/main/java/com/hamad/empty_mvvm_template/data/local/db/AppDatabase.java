package com.hamad.empty_mvvm_template.data.local.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
//import com.hamad.mvvmtemplate.data.local.db.dao.QuestionDao;
import com.hamad.empty_mvvm_template.data.local.db.dao.UserDao;
//import com.hamad.mvvmtemplate.data.model.db.Question;
import com.hamad.empty_mvvm_template.data.model.db.User;




//@Database(entities = {User.class, Entity.class}, version = 2)
@Database(entities = {User.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();
    //public abstract EntityDao entityDao();


}

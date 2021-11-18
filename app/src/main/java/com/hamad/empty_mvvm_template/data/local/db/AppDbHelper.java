package com.hamad.empty_mvvm_template.data.local.db;

import com.hamad.empty_mvvm_template.data.model.db.User;
import io.reactivex.Observable;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton//this layer is a link between local database and outside world.
          //this layer deal with "entities daos" and the upper layer deal with "this layer".
public class AppDbHelper implements DbHelper {

    private final AppDatabase mAppDatabase;

    @Inject
    public AppDbHelper(AppDatabase appDatabase) {
        this.mAppDatabase = appDatabase;
    }

    //--------------------------------------------------------------------------------------------------
    //the implementations of the UserDao Methods must added here
    @Override
    public Observable<List<User>> getAllUsers() {
        return Observable.fromCallable(new Callable<List<User>>() {
            @Override
            public List<User> call() throws Exception {
                return mAppDatabase.userDao().loadAll();
            }
        });
    }
    @Override
    public Observable<Boolean> insertUser(final User user) {
        return Observable.fromCallable(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                mAppDatabase.userDao().insert(user);
                return true;
            }
        });
    }
    //--------------------------------------------------------------------------------------------------


    //If there is another entity implement its Daos method here

}

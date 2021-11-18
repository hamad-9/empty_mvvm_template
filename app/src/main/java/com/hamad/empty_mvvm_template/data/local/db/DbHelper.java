package com.hamad.empty_mvvm_template.data.local.db;
import com.hamad.empty_mvvm_template.data.model.db.User;
import io.reactivex.Observable;
import java.util.List;


public interface DbHelper {
    Observable<List<User>> getAllUsers();
    Observable<Boolean> insertUser(final User user);

}

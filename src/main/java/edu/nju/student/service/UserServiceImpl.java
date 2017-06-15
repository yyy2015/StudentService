package edu.nju.student.service;

import edu.nju.student.dao.UserDao;
import edu.nju.student.exception.ParamNullException;
import edu.nju.student.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;

/**
 * Created by yyy on 2017/6/13.
 */
@WebService(serviceName = "UserService",
            endpointInterface = "edu.nju.student.service.UserService")
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public UserEntity login(String email, String password) throws ParamNullException {

        if(email.equals("")||password.equals("")||email==null||password==null){
            throw new ParamNullException("login","email or password is empty or is null");
        }else {
            return userDao.findUserEntityByEmailAndPassword(email, password);
        }
    }

}

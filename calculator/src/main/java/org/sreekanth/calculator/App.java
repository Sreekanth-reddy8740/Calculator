package org.sreekanth.calculator;

import org.sreekanth.calculator.entity.UserEntity;
import org.sreekanth.calculator.repository.UserRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        UserEntity userEntity = new UserEntity();
        userEntity.setName("Sreekanth");
        userEntity.setEmail("ns@gmail.com");
        userEntity.setPassword("@1234");
        userEntity.setPhoneNumber("123456789");
        userEntity.setCity("ATP");
        userEntity.setPincode("515721");
        
        UserRepository repository = new UserRepository();
        repository.saveOrUpdate(userEntity);
    }
}

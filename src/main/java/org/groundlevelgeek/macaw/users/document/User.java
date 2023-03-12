package org.groundlevelgeek.macaw.users.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class User {

    @Id
    private String id;

    public String name;
    public String email;
    public String hobby;

    public User(String name, String email, String hobby) {
        this.name = name;
        this.email = email;
        this.hobby = hobby;
    }

}

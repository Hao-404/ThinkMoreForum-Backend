package com.thinkmore.forum.dto.users;

import com.thinkmore.forum.dto.img.ImgPutDto;
import com.thinkmore.forum.dto.roles.RolesPutDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
public class UsersPutDto implements Serializable {
    private UUID id;
    private String username;
    private String password;
    private String email;
    private ImgPutDto profileImg;
    private RolesPutDto role;
    private OffsetDateTime lastLoginTimestamp;
    private OffsetDateTime createTimestamp;
}

package az.unibank.unitechmsauth.mapper;

import az.unibank.unitechmsauth.dao.entity.UserEntity;
import az.unibank.unitechmsauth.model.UserCreateDto;
import az.unibank.unitechmsauth.model.response.UserResponseDto;

public class UserMapperImpl implements UserMapper {
    public UserMapperImpl() {
    }

    @Override
    public UserResponseDto toUserResponseDto(UserEntity entity) {
        if (entity == null) {
            return null;
        } else {
            UserResponseDto responseDto = new UserResponseDto();
            responseDto.setCustomerPin(entity.getCustomerPin());
            responseDto.setEmail(entity.getEmail());
            responseDto.setId(entity.getId());
            responseDto.setName(entity.getName());
            responseDto.setSurname(entity.getSurname());
            return responseDto;
        }
    }

    @Override
    public UserEntity toUserEntity(UserCreateDto userCreateDto) {
        if (userCreateDto == null) {
            return null;
        } else {
            UserEntity userEntity = new UserEntity();
            userEntity.setCustomerPin(userCreateDto.getCustomerPin());
            userEntity.setEmail(userCreateDto.getEmail());
            userEntity.setName(userCreateDto.getName());
            userEntity.setSurname(userCreateDto.getSurname());
            userEntity.setPassword(userCreateDto.getPassword());
            return userEntity;
        }
    }


}

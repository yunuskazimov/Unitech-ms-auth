package az.unibank.unitechmsauth.mapper;


import az.unibank.unitechmsauth.dao.entity.UserEntity;
import az.unibank.unitechmsauth.model.UserCreateDto;
import az.unibank.unitechmsauth.model.response.UserResponseDto;
import org.mapstruct.factory.Mappers;


public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserResponseDto toUserResponseDto(UserEntity user);

    UserEntity toUserEntity(UserCreateDto userCreateDto);

}

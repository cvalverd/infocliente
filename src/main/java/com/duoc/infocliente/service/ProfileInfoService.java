package com.duoc.infocliente.service;
import java.util.List;
import java.util.Optional;
import com.duoc.infocliente.model.ProfileInfo;

public interface ProfileInfoService {
        ProfileInfo updateProfileInfo(Long id, ProfileInfo profileInfo );
        Optional<ProfileInfo> findProfileInfoById(Long id);
        List<ProfileInfo> findAllProfileInfos();
        void deleteProfileInfoById(Long id);
      
}

package com.duoc.infocliente.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.duoc.infocliente.model.ProfileInfo;
import com.duoc.infocliente.repository.ProfileInfoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class ProfileInfoServiceImpl implements ProfileInfoService {
    
    private final ProfileInfoRepository profileInfoRepository;


    @Override
        public ProfileInfo updateProfileInfo(Long id, ProfileInfo profileInfo) {
            if(profileInfoRepository.existsById(id)){
                profileInfo.setId(id);
                return profileInfoRepository.save(profileInfo);
            }   else {
                    return null;
            }
        }

        
        public Optional<ProfileInfo> findProfileInfoById(Long id) {
            return profileInfoRepository.findById(id);
        }
        
    
        public List<ProfileInfo> findAllProfileInfos(){
            return profileInfoRepository.findAll();
        }

         
        public void deleteProfileInfoById(Long id) {
            profileInfoRepository.deleteById(id);
        }
}

package campus.tech.kakao.map.domain.repository

import campus.tech.kakao.map.data.remote_config.ServiceInformation

interface RemoteConfigRepository {
    suspend fun getServiceInformation(): ServiceInformation?
}
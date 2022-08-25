package com.student.manage.smgatewayservice.grpc.config;

import com.student.manage.student.proto.StudentServiceGrpc;
import io.grpc.Channel;
import io.grpc.ClientInterceptor;
import io.grpc.ClientInterceptors;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lkadai0801
 * @since 24/08/2022
 */

@Configuration
public class StudentStubConfig {
//    private final ClientInterceptor clientInterceptors;
//
//    public StudentStubConfig(ClientInterceptor clientInterceptors) {
//        this.clientInterceptors = clientInterceptors;
//    }

    @Bean
    public StudentServiceGrpc.StudentServiceBlockingStub studentServiceBlockingStub(@Qualifier("StudentGrpcChannel")Channel channel){
        return StudentServiceGrpc.newBlockingStub(channel);
//                .withInterceptors(clientInterceptors);
    }
}

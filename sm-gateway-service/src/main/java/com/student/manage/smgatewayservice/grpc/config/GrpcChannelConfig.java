package com.student.manage.smgatewayservice.grpc.config;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @author lkadai0801
 * @since 24/08/2022
 */

@RequiredArgsConstructor
@Configuration
@SuppressWarnings("unused")
public class GrpcChannelConfig {
    private final Environment environment;

    @Bean("StudentGrpcChannel")
    public ManagedChannel studentGrpcChannel(){
        var messageSize = environment.getRequiredProperty("student-manage.grpc.client.student.message.size", Integer.class);
        return ManagedChannelBuilder.forAddress(
                environment.getRequiredProperty("student-manage.grpc.client.student.host"),
                environment.getRequiredProperty("student-manage.grpc.client.student.port", Integer.class)
        )
                .usePlaintext()
                .maxInboundMessageSize(messageSize * 1024 * 1024)
                .build();
    }
}

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.endpoint;

import javax.annotation.Generated;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;

/**
 * The aws-iam is used for managing Amazon IAM
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IAMEndpointBuilder {


    public static class IAMCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        IAMCommonBuilder(String path) {
            super("aws-iam", path);
        }
        /**
         * Logical name. The option is a java.lang.String type.
         */
        public T label(String label) {
            this.properties.put("label", label);
            return (T) this;
        }
        /**
         * The region in which IAM client needs to work. The option is a
         * java.lang.String type.
         */
        public T region(String region) {
            this.properties.put("region", region);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * will be converted to a boolean type.
         */
        public T basicPropertyBinding(String basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * will be converted to a boolean type.
         */
        public T synchronous(String synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
    }

    public static class IAMProducerBuilder
            extends
                IAMCommonBuilder<IAMProducerBuilder>
            implements
                EndpointProducerBuilder {
        public IAMProducerBuilder(String path) {
            super(path);
        }
        /**
         * Amazon AWS Access Key. The option is a java.lang.String type.
         */
        public IAMProducerBuilder accessKey(String accessKey) {
            this.properties.put("accessKey", accessKey);
            return (IAMProducerBuilder) this;
        }
        /**
         * To use a existing configured AWS IAM as client. The option is a
         * com.amazonaws.services.identitymanagement.AmazonIdentityManagement
         * type.
         */
        public IAMProducerBuilder iamClient(Object iamClient) {
            this.properties.put("iamClient", iamClient);
            return (IAMProducerBuilder) this;
        }
        /**
         * To use a existing configured AWS IAM as client. The option will be
         * converted to a
         * com.amazonaws.services.identitymanagement.AmazonIdentityManagement
         * type.
         */
        public IAMProducerBuilder iamClient(String iamClient) {
            this.properties.put("iamClient", iamClient);
            return (IAMProducerBuilder) this;
        }
        /**
         * The operation to perform. The option is a
         * org.apache.camel.component.aws.iam.IAMOperations type.
         */
        public IAMProducerBuilder operation(IAMOperations operation) {
            this.properties.put("operation", operation);
            return (IAMProducerBuilder) this;
        }
        /**
         * The operation to perform. The option will be converted to a
         * org.apache.camel.component.aws.iam.IAMOperations type.
         */
        public IAMProducerBuilder operation(String operation) {
            this.properties.put("operation", operation);
            return (IAMProducerBuilder) this;
        }
        /**
         * To define a proxy host when instantiating the IAM client. The option
         * is a java.lang.String type.
         */
        public IAMProducerBuilder proxyHost(String proxyHost) {
            this.properties.put("proxyHost", proxyHost);
            return (IAMProducerBuilder) this;
        }
        /**
         * To define a proxy port when instantiating the IAM client. The option
         * is a java.lang.Integer type.
         */
        public IAMProducerBuilder proxyPort(Integer proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (IAMProducerBuilder) this;
        }
        /**
         * To define a proxy port when instantiating the IAM client. The option
         * will be converted to a java.lang.Integer type.
         */
        public IAMProducerBuilder proxyPort(String proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (IAMProducerBuilder) this;
        }
        /**
         * Amazon AWS Secret Key. The option is a java.lang.String type.
         */
        public IAMProducerBuilder secretKey(String secretKey) {
            this.properties.put("secretKey", secretKey);
            return (IAMProducerBuilder) this;
        }
    }

    public static enum IAMOperations {
        listAccessKeys, createUser, deleteUser, getUser, listUsers, createAccessKey, deleteAccessKey, updateAccessKey, createGroup, deleteGroup, listGroups, addUserToGroup, removeUserFromGroup;
    }
    public default IAMProducerBuilder toIAM(String path) {
        return new IAMProducerBuilder(path);
    }
}
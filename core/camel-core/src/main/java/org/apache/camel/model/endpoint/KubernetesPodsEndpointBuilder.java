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
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The Kubernetes Pods component provides a producer to execute kubernetes pod
 * operations and a consumer to consume pod events.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface KubernetesPodsEndpointBuilder {


    public static class KubernetesPodsCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        KubernetesPodsCommonBuilder(String path) {
            super("kubernetes-pods", path);
        }
        /**
         * Kubernetes Master url. The option is a java.lang.String type.
         */
        public T masterUrl(String masterUrl) {
            this.properties.put("masterUrl", masterUrl);
            return (T) this;
        }
        /**
         * The Kubernetes API Version to use. The option is a java.lang.String
         * type.
         */
        public T apiVersion(String apiVersion) {
            this.properties.put("apiVersion", apiVersion);
            return (T) this;
        }
        /**
         * The dns domain, used for ServiceCall EIP. The option is a
         * java.lang.String type.
         */
        public T dnsDomain(String dnsDomain) {
            this.properties.put("dnsDomain", dnsDomain);
            return (T) this;
        }
        /**
         * Default KubernetesClient to use if provided. The option is a
         * io.fabric8.kubernetes.client.KubernetesClient type.
         */
        public T kubernetesClient(Object kubernetesClient) {
            this.properties.put("kubernetesClient", kubernetesClient);
            return (T) this;
        }
        /**
         * Default KubernetesClient to use if provided. The option will be
         * converted to a io.fabric8.kubernetes.client.KubernetesClient type.
         */
        public T kubernetesClient(String kubernetesClient) {
            this.properties.put("kubernetesClient", kubernetesClient);
            return (T) this;
        }
        /**
         * The port name, used for ServiceCall EIP. The option is a
         * java.lang.String type.
         */
        public T portName(String portName) {
            this.properties.put("portName", portName);
            return (T) this;
        }
        /**
         * The port protocol, used for ServiceCall EIP. The option is a
         * java.lang.String type.
         */
        public T portProtocol(String portProtocol) {
            this.properties.put("portProtocol", portProtocol);
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
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server. The option is a java.lang.Integer type.
         */
        public T connectionTimeout(Integer connectionTimeout) {
            this.properties.put("connectionTimeout", connectionTimeout);
            return (T) this;
        }
        /**
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server. The option will be converted to a
         * java.lang.Integer type.
         */
        public T connectionTimeout(String connectionTimeout) {
            this.properties.put("connectionTimeout", connectionTimeout);
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
        /**
         * The CA Cert Data. The option is a java.lang.String type.
         */
        public T caCertData(String caCertData) {
            this.properties.put("caCertData", caCertData);
            return (T) this;
        }
        /**
         * The CA Cert File. The option is a java.lang.String type.
         */
        public T caCertFile(String caCertFile) {
            this.properties.put("caCertFile", caCertFile);
            return (T) this;
        }
        /**
         * The Client Cert Data. The option is a java.lang.String type.
         */
        public T clientCertData(String clientCertData) {
            this.properties.put("clientCertData", clientCertData);
            return (T) this;
        }
        /**
         * The Client Cert File. The option is a java.lang.String type.
         */
        public T clientCertFile(String clientCertFile) {
            this.properties.put("clientCertFile", clientCertFile);
            return (T) this;
        }
        /**
         * The Key Algorithm used by the client. The option is a
         * java.lang.String type.
         */
        public T clientKeyAlgo(String clientKeyAlgo) {
            this.properties.put("clientKeyAlgo", clientKeyAlgo);
            return (T) this;
        }
        /**
         * The Client Key data. The option is a java.lang.String type.
         */
        public T clientKeyData(String clientKeyData) {
            this.properties.put("clientKeyData", clientKeyData);
            return (T) this;
        }
        /**
         * The Client Key file. The option is a java.lang.String type.
         */
        public T clientKeyFile(String clientKeyFile) {
            this.properties.put("clientKeyFile", clientKeyFile);
            return (T) this;
        }
        /**
         * The Client Key Passphrase. The option is a java.lang.String type.
         */
        public T clientKeyPassphrase(String clientKeyPassphrase) {
            this.properties.put("clientKeyPassphrase", clientKeyPassphrase);
            return (T) this;
        }
        /**
         * The Auth Token. The option is a java.lang.String type.
         */
        public T oauthToken(String oauthToken) {
            this.properties.put("oauthToken", oauthToken);
            return (T) this;
        }
        /**
         * Password to connect to Kubernetes. The option is a java.lang.String
         * type.
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * Define if the certs we used are trusted anyway or not. The option is
         * a java.lang.Boolean type.
         */
        public T trustCerts(Boolean trustCerts) {
            this.properties.put("trustCerts", trustCerts);
            return (T) this;
        }
        /**
         * Define if the certs we used are trusted anyway or not. The option
         * will be converted to a java.lang.Boolean type.
         */
        public T trustCerts(String trustCerts) {
            this.properties.put("trustCerts", trustCerts);
            return (T) this;
        }
        /**
         * Username to connect to Kubernetes. The option is a java.lang.String
         * type.
         */
        public T username(String username) {
            this.properties.put("username", username);
            return (T) this;
        }
    }

    public static class KubernetesPodsConsumerBuilder
            extends
                KubernetesPodsCommonBuilder<KubernetesPodsConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public KubernetesPodsConsumerBuilder(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        public KubernetesPodsConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (KubernetesPodsConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option will be converted to a boolean type.
         */
        public KubernetesPodsConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (KubernetesPodsConsumerBuilder) this;
        }
        /**
         * The Consumer Label key when watching at some resources. The option is
         * a java.lang.String type.
         */
        public KubernetesPodsConsumerBuilder labelKey(String labelKey) {
            this.properties.put("labelKey", labelKey);
            return (KubernetesPodsConsumerBuilder) this;
        }
        /**
         * The Consumer Label value when watching at some resources. The option
         * is a java.lang.String type.
         */
        public KubernetesPodsConsumerBuilder labelValue(String labelValue) {
            this.properties.put("labelValue", labelValue);
            return (KubernetesPodsConsumerBuilder) this;
        }
        /**
         * The namespace. The option is a java.lang.String type.
         */
        public KubernetesPodsConsumerBuilder namespace(String namespace) {
            this.properties.put("namespace", namespace);
            return (KubernetesPodsConsumerBuilder) this;
        }
        /**
         * The Consumer pool size. The option is a int type.
         */
        public KubernetesPodsConsumerBuilder poolSize(int poolSize) {
            this.properties.put("poolSize", poolSize);
            return (KubernetesPodsConsumerBuilder) this;
        }
        /**
         * The Consumer pool size. The option will be converted to a int type.
         */
        public KubernetesPodsConsumerBuilder poolSize(String poolSize) {
            this.properties.put("poolSize", poolSize);
            return (KubernetesPodsConsumerBuilder) this;
        }
        /**
         * The Consumer Resource Name we would like to watch. The option is a
         * java.lang.String type.
         */
        public KubernetesPodsConsumerBuilder resourceName(String resourceName) {
            this.properties.put("resourceName", resourceName);
            return (KubernetesPodsConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public KubernetesPodsConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (KubernetesPodsConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option will be
         * converted to a org.apache.camel.spi.ExceptionHandler type.
         */
        public KubernetesPodsConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (KubernetesPodsConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public KubernetesPodsConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (KubernetesPodsConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option will be converted to a org.apache.camel.ExchangePattern type.
         */
        public KubernetesPodsConsumerBuilder exchangePattern(
                String exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (KubernetesPodsConsumerBuilder) this;
        }
    }

    public static class KubernetesPodsProducerBuilder
            extends
                KubernetesPodsCommonBuilder<KubernetesPodsProducerBuilder>
            implements
                EndpointProducerBuilder {
        public KubernetesPodsProducerBuilder(String path) {
            super(path);
        }
        /**
         * Producer operation to do on Kubernetes. The option is a
         * java.lang.String type.
         */
        public KubernetesPodsProducerBuilder operation(String operation) {
            this.properties.put("operation", operation);
            return (KubernetesPodsProducerBuilder) this;
        }
    }
    public default KubernetesPodsConsumerBuilder fromKubernetesPods(String path) {
        return new KubernetesPodsConsumerBuilder(path);
    }
    public default KubernetesPodsProducerBuilder toKubernetesPods(String path) {
        return new KubernetesPodsProducerBuilder(path);
    }
}
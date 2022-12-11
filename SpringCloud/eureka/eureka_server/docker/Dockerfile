FROM openjdk:8
ENV workdir=/root/eureka-server
COPY . ${workdir}
WORKDIR ${workdir}
EXPOSE 8761
CMD ["java","-jar","eureka_server-1.0.jar"]
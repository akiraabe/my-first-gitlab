# syntax = docker/dockerfile:1
######################################
# ベースイメージ
######################################
FROM amazoncorretto:11-alpine as base
# 必要なパッケージを追加
# RUN apk update \
#  && apk --no-cache add tzdata=2022a-r0
# タイムゾーン設定
ENV LANG ja_JP.UTF-8
ENV LANGUAGE ja_JP
ENV LC_ALL ja_JP.UTF-8
ENV TZ='Asia/Tokyo'
ENV APP_HOME /home/myapp
# 特別な権限のあるファイルを排除
RUN find / -xdev -perm /6000 -type f -exec chmod a-s {} \; || true
# 一般ユーザーの作成
RUN addgroup -g 2000 -S myapp \
 && adduser -u 2000 -S myapp -G myapp
USER myapp
WORKDIR $APP_HOME
######################################
# 最終イメージ
######################################
FROM base as final
# ベースイメージに対して必要なjarFileをローカルからコピー
# Dockerfileと同じPathにapp.jarがある前提
COPY target/demo-0.0.1-SNAPSHTO.jar /home/myapp/app.jar
ENTRYPOINT ["java", "-jar", "/home/myapp/app.jar"]
EXPOSE 8080

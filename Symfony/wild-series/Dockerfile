FROM php:8.1.3-fpm

#phpredis installation

# Copy composer.lock and composer.json
COPY ./composer.lock ./composer.json /var/www/
COPY docker-entry.sh /
RUN chmod +x /docker-entry.sh

# Set working directory
WORKDIR /var/www

# Install dependencies
RUN apt-get update && apt-get install -y \
    build-essential \
    locales \
    zip \
    unzip \
    git \
    curl \
    nginx \
    default-mysql-client

# Clear cache
RUN apt-get clean && rm -rf /var/lib/apt/lists/*

# Install extensions
RUN apt-get update && apt-get install -y gnupg2
RUN yes | apt-get install libxslt-dev libonig-dev libzip-dev
RUN docker-php-ext-install pdo_mysql mbstring zip exif pcntl intl

RUN apt-get update && \
apt-get install -y libfreetype6-dev libjpeg62-turbo-dev libpng-dev && \
docker-php-ext-configure gd --with-freetype=/usr/include/ --with-jpeg=/usr/include/ && \
docker-php-ext-install gd

RUN docker-php-ext-install xsl

# Install composer
RUN rm -rf composer.lock
RUN curl -sS https://getcomposer.org/installer | php -- --install-dir=/usr/local/bin --filename=composer
RUN composer install \
    --ignore-platform-reqs \
    --no-interaction \
    --no-plugins \
    --no-scripts \
    --prefer-dist \
    --quiet

#Not tested in a new project but we have to install yarn (Guillaume) :
RUN curl -sS https://dl.yarnpkg.com/debian/pubkey.gpg | apt-key add -
RUN echo "deb https://dl.yarnpkg.com/debian/ stable main" | tee /etc/apt/sources.list.d/yarn.list
RUN apt update
RUN yes | apt install yarn

# Copy existing application directory
COPY ./ /var/www/
RUN ls /var/www

COPY ./configuration/nginx/conf.d/ /etc/nginx/conf.d/
RUN ls /etc/nginx/conf.d

COPY ./configuration/php/local.ini /usr/local/etc/php/conf.d/local.ini
RUN ls /usr/local/etc/php/conf.d
RUN cat /usr/local/etc/php/conf.d/local.ini

RUN rm -rf /etc/nginx/sites-enabled
RUN mkdir -p /etc/nginx/sites-enabled

RUN chmod -R 777 /var/www/public

# RUN rm -rf /var/www/yarn.lock
RUN curl -fsSL https://deb.nodesource.com/setup_lts.x | bash -
RUN apt-get update && apt-get install -y nodejs




RUN yarn install
# RUN yarn encore dev
#RUN php bin/console cache:clear

#RUN mkdir var
#RUN mkdir var/cache
#RUN chown -R www-data:www-data var/cache
#RUN chown -R www-data:www-data var
# Pour le moment, build des assets en local pour économiser la RAM
# RUN yarn encore dev
#RUN php bin/console cache:clear

RUN mkdir var
RUN mkdir var/cache
RUN chown -R www-data:www-data var/cache
RUN chown -R www-data:www-data var

RUN composer dump-autoload

# Expose port 80 and start php-fpm server
EXPOSE 80
CMD ["/docker-entry.sh"]

package com.booklendingsystem.admin.service.impl;

import com.booklendingsystem.admin.entity.Location;
import com.booklendingsystem.admin.mapper.LocationMapper;
import com.booklendingsystem.admin.service.LocationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author SiKun
 * @since 2021-10-21
 */
@Service
public class LocationServiceImpl extends ServiceImpl<LocationMapper, Location> implements LocationService {

}
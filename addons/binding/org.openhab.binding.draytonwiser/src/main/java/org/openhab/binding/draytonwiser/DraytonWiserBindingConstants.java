/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.draytonwiser;

import java.util.Map;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.smarthome.core.thing.ThingTypeUID;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * The {@link DraytonWiserBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Andrew Schofield - Initial contribution
 */
@NonNullByDefault
public class DraytonWiserBindingConstants {

    public static final String BINDING_ID = "draytonwiser";

    public static final String ADDRESS = "networkAddress";

    public static final String SECRET = "secret";

    public static final String REFRESH_INTERVAL = "refresh";

    public static final String AWAY_MODE_SETPOINT = "awaySetPoint";

    public static final Integer OFFLINE_TEMPERATURE = -32768;

    // Web Service Endpoints
    public static final String DEVICE_ENDPOINT = "data/domain/Device/";
    public static final String ROOMSTATS_ENDPOINT = "data/domain/RoomStat/";
    public static final String TRVS_ENDPOINT = "data/domain/SmartValve/";
    public static final String ROOMS_ENDPOINT = "data/domain/Room/";
    public static final String SCHEDULES_ENDPOINT = "data/domain/Schedule/";
    public static final String HEATCHANNELS_ENDPOINT = "data/domain/HeatingChannel/";
    public static final String SYSTEM_ENDPOINT = "data/domain/System/";
    public static final String STATION_ENDPOINT = "data/network/Station/";
    public static final String DOMAIN_ENDPOINT = "data/domain/";
    public static final String HOTWATER_ENDPOINT = "data/domain/HotWater/";
    public static final String SMARTPLUG_ENDPOINT = "data/domain/SmartPlug/";

    // bridge
    public static final ThingTypeUID THING_TYPE_BRIDGE = new ThingTypeUID(BINDING_ID, "heathub");

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_CONTROLLER = new ThingTypeUID(BINDING_ID, "boiler-controller");
    public static final ThingTypeUID THING_TYPE_ROOM = new ThingTypeUID(BINDING_ID, "room");
    public static final ThingTypeUID THING_TYPE_ROOMSTAT = new ThingTypeUID(BINDING_ID, "roomstat");
    public static final ThingTypeUID THING_TYPE_ITRV = new ThingTypeUID(BINDING_ID, "itrv");
    public static final ThingTypeUID THING_TYPE_HOTWATER = new ThingTypeUID(BINDING_ID, "hotwater");
    public static final ThingTypeUID THING_TYPE_SMARTPLUG = new ThingTypeUID(BINDING_ID, "smart-plug");

    // List of all Channel ids
    public static final String CHANNEL_CURRENT_TEMPERATURE = "currentTemperature";
    public static final String CHANNEL_CURRENT_HUMIDITY = "currentHumidity";
    public static final String CHANNEL_CURRENT_SETPOINT = "currentSetPoint";
    public static final String CHANNEL_CURRENT_BATTERY_VOLTAGE = "currentBatteryVoltage";
    public static final String CHANNEL_CURRENT_BATTERY_LEVEL = "currentBatteryLevel";
    public static final String CHANNEL_CURRENT_WISER_BATTERY_LEVEL = "currentWiserBatteryLevel";
    public static final String CHANNEL_CURRENT_DEMAND = "currentDemand";
    public static final String CHANNEL_HEAT_REQUEST = "heatRequest";
    public static final String CHANNEL_CURRENT_SIGNAL_RSSI = "currentSignalRSSI";
    public static final String CHANNEL_CURRENT_SIGNAL_LQI = "currentSignalLQI";
    public static final String CHANNEL_CURRENT_SIGNAL_STRENGTH = "currentSignalStrength";
    public static final String CHANNEL_CURRENT_WISER_SIGNAL_STRENGTH = "currentWiserSignalStrength";
    public static final String CHANNEL_HEATING_OVERRIDE = "heatingOverride";
    public static final String CHANNEL_HOT_WATER_OVERRIDE = "hotWaterOverride";
    public static final String CHANNEL_HEATCHANNEL_1_DEMAND = "heatChannel1Demand";
    public static final String CHANNEL_HEATCHANNEL_2_DEMAND = "heatChannel2Demand";
    public static final String CHANNEL_HEATCHANNEL_1_DEMAND_STATE = "heatChannel1DemandState";
    public static final String CHANNEL_HEATCHANNEL_2_DEMAND_STATE = "heatChannel2DemandState";
    public static final String CHANNEL_HOTWATER_DEMAND_STATE = "hotWaterDemandState";
    public static final String CHANNEL_AWAY_MODE_STATE = "awayModeState";
    public static final String CHANNEL_ECO_MODE_STATE = "ecoModeState";
    public static final String CHANNEL_MANUAL_MODE_STATE = "manualModeState";
    public static final String CHANNEL_ZIGBEE_CONNECTED = "zigbeeConnected";
    public static final String CHANNEL_HOT_WATER_SETPOINT = "hotWaterSetPoint";
    public static final String CHANNEL_HOT_WATER_BOOST_DURATION = "hotWaterBoostDuration";
    public static final String CHANNEL_HOT_WATER_BOOSTED = "hotWaterBoosted";
    public static final String CHANNEL_HOT_WATER_BOOST_REMAINING = "hotWaterBoostRemaining";
    public static final String CHANNEL_ROOM_BOOST_DURATION = "roomBoostDuration";
    public static final String CHANNEL_ROOM_BOOSTED = "roomBoosted";
    public static final String CHANNEL_ROOM_BOOST_REMAINING = "roomBoostRemaining";
    public static final String CHANNEL_ROOM_WINDOW_STATE_DETECTION = "windowStateDetection";
    public static final String CHANNEL_ROOM_WINDOW_STATE = "windowState";
    public static final String CHANNEL_ROOM_MASTER_SCHEDULE = "masterSchedule";
    public static final String CHANNEL_DEVICE_LOCKED = "deviceLocked";
    public static final String CHANNEL_SMARTPLUG_OUTPUT_STATE = "plugOutputState";
    public static final String CHANNEL_SMARTPLUG_AWAY_ACTION = "plugAwayAction";

    public static final Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Sets.newHashSet(THING_TYPE_CONTROLLER,
            THING_TYPE_ROOM, THING_TYPE_ROOMSTAT, THING_TYPE_BRIDGE, THING_TYPE_ITRV, THING_TYPE_HOTWATER,
            THING_TYPE_SMARTPLUG);

    // Lookups from text representations to useful openhab values
    public static final Map<String, Integer> SIGNAL_STRENGTH_MAP = Maps
            .newHashMap(ImmutableMap.of("VeryGood", 4, "Good", 3, "Medium", 2, "Poor", 1, "NoSignal", 0));

    public static final Map<String, Integer> BATTERY_LEVEL_MAP = ImmutableMap.<String, Integer> builder()
            .put("Full", 100).put("Normal", 80).put("TwoThirds", 60).put("OneThird", 40).put("Low", 20)
            .put("Critical", 0).build();
}

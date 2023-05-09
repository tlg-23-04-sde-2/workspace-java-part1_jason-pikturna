package com.entertainment;

/*
 * This provides for exactly 5 instances of com.entertainment.DisplayType
 * An enum type has a FIXED number of NAMED instances.
 *
 * These are com.entertainment.DisplayType object, NOT STRINGS.
 *
 * They are referenced as:
 * com.entertainment.DisplayType.LED
 * com.entertainment.DisplayType.OLED
 * ...
 * com.entertainment.DisplayType.CRT
 */
public enum DisplayType {
    LED, OLED, PLASMA, LCD, CRT
}
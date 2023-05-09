/*
 * This provides for exactly 5 instances of DisplayType
 * An enum type has a FIXED number of NAMED instances.
 *
 * These are DisplayType object, NOT STRINGS.
 *
 * They are referenced as:
 * DisplayType.LED
 * DisplayType.OLED
 * ...
 * DisplayType.CRT
 */
enum DisplayType {
    LED, OLED, PLASMA, LCD, CRT
}
/*
 *  Copyright 2011 Benjamin Glatzel <benjamin.glatzel@me.com>.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package com.github.begla.blockmania;

import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.vector.Vector3f;

/**
 * Stores the settings of the game.
 * 
 * TODO: Replace with a single hashmap
 *
 * @author Benjamin Glatzel <benjamin.glatzel@me.com>
 */
public class Configuration {

    public static final String GAME_TITLE = "Blockmania Alpha v0.02";
    // World
    public static final Vector3f VIEWING_DISTANCE_IN_CHUNKS = new Vector3f(23.0f, 1.0f, 23.0f);
    public static final float SUN_SIZE = 64f;
    public static final String DEFAULT_SEED = "yMfLzKzZvHzQiWhA";
    // Chunk
    public static final Vector3f CHUNK_DIMENSIONS = new Vector3f(16, 128, 16);
    // Debug
    public static boolean SHOW_PLACING_BOX = true;
    public static boolean SHOW_CHUNK_OUTLINES = false;
    // Display
    public static final int DISPLAY_HEIGHT = 720;
    public static final int DISPLAY_WIDTH = 1280;
    public static final boolean FULLSCREEN = false;
    // Illumination
    public static final byte MAX_LIGHT = 16;
    public static final byte MIN_LIGHT = 0;
    public static final float OCCLUSION_INTENS = 0.0625f;
    public static final float BLOCK_SIDE_DIMMING = 0.075f;
    public static final float LIGHT_ABSORPTION = 0.0625f;
    // Player
    public static final int JUMP_INTENSITY = 8;
    public static final int MAX_GRAVITY = 32;
    public static final float WALKING_SPEED = 1.5f;
    public static final float RUNNING_SPEED = 2.5f;
    public static final boolean ENABLE_BOBBING = true;
    public static final float PLAYER_HEIGHT = 1.25f;
    public static final float G_FORCE = 0.025f;
    public static final float SLOWDOWN_INTENS = 0.05f;
    // Graphics
    public static final PixelFormat PIXEL_FORMAT = new PixelFormat().withDepthBits(24).withSRGB(true);
}
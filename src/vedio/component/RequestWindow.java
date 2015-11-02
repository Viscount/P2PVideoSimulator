package vedio.component;

import vedio.entity.Chunk;

import java.util.List;

/**
 * Created by Jaric Liao on 2015/11/2.
 */
public class RequestWindow {

    private static int REQUEST_WINDOW_LENGTH = 10;

    private long currentVideoId;
    private long startTime;

    private List<Chunk> detail;

}

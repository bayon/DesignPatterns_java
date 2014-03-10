package com.example.iterator;

/**
 * Created by BForte on 3/10/14.
 */
public interface ChannelCollection {

    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    public ChannelIterator iterator(ChannelTypeEnum type);

}
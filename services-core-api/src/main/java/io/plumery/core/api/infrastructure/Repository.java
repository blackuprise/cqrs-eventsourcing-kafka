package io.plumery.core.api.infrastructure;

import io.plumery.core.api.AggregateRoot;
import io.plumery.core.api.ID;

/**
 * This interface represents a generic repository capable of saving versioned aggregate roots
 *
 * @author V.Goldin
 */
public interface Repository<T extends AggregateRoot> {
    public void save(T message, int version);
    public T getById(ID id);
}
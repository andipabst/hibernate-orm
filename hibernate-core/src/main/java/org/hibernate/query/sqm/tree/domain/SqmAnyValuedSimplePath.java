/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.query.sqm.tree.domain;

import org.hibernate.persister.entity.PropertyMapping;
import org.hibernate.query.NavigablePath;
import org.hibernate.query.criteria.PathException;
import org.hibernate.query.sqm.NodeBuilder;
import org.hibernate.query.sqm.consume.spi.SemanticQueryWalker;
import org.hibernate.query.sqm.produce.path.spi.SemanticPathPart;
import org.hibernate.query.sqm.produce.spi.SqmCreationState;

/**
 * @author Steve Ebersole
 */
public class SqmAnyValuedSimplePath<T> extends AbstractSqmSimplePath<T> {
	public SqmAnyValuedSimplePath(
			NavigablePath navigablePath,
			Navigable<T> referencedNavigable,
			SqmPath lhs, NodeBuilder nodeBuilder) {
		super( navigablePath, referencedNavigable, lhs, nodeBuilder );
	}

	public SqmAnyValuedSimplePath(
			NavigablePath navigablePath,
			Navigable<T> referencedNavigable,
			SqmPath lhs, String explicitAlias, NodeBuilder nodeBuilder) {
		super( navigablePath, referencedNavigable, lhs, explicitAlias, nodeBuilder );
	}

	@Override
	public PropertyMapping getReferencedPropertyMapping() {
		return null;
	}

	@Override
	public <S extends T> SqmTreatedPath<T, S> treatAs(Class<S> treatJavaType) throws PathException {
		return null;
	}

	@Override
	public SemanticPathPart resolvePathPart(
			String name, String currentContextKey, boolean isTerminal, SqmCreationState creationState) {
		return null;
	}

	@Override
	public <X> X accept(SemanticQueryWalker<X> walker) {
		return null;
	}
}
/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.RatingValueIdentifier;
import com.tools20022.repository.entity.Scheme;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Assessment of securities credit and investment risk.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Rating" src="doc-files/Rating.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Rating#mmSecurity
 * Rating.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Rating#mmRatingScheme
 * Rating.mmRatingScheme}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Rating#mmValueDate
 * Rating.mmValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Rating#mmValue
 * Rating.mmValue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmRating
 * Security.mmRating}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#mmRating
 * Scheme.mmRating}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Rating"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Assessment of securities credit and investment risk."</li>
 * </ul>
 */
public class Rating {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Security security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRating
	 * Security.mmRating}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Rating
	 * Rating}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which a rating is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Rating, Optional<Security>> mmSecurity = new MMBusinessAssociationEnd<Rating, Optional<Security>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Rating.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a rating is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Security.mmRating;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Security.mmObject();
		}

		@Override
		public Optional<Security> getValue(Rating obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(Rating obj, Optional<Security> value) {
			obj.setSecurity(value.orElse(null));
		}
	};
	protected Scheme ratingScheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Scheme#mmRating
	 * Scheme.mmRating}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Scheme Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Rating
	 * Rating}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RatingScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information regarding the entity that assigns the rating."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Rating, Scheme> mmRatingScheme = new MMBusinessAssociationEnd<Rating, Scheme>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Rating.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RatingScheme";
			definition = "Information regarding the entity that assigns the rating.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Scheme.mmRating;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Scheme.mmObject();
		}

		@Override
		public Scheme getValue(Rating obj) {
			return obj.getRatingScheme();
		}

		@Override
		public void setValue(Rating obj, Scheme value) {
			obj.setRatingScheme(value);
		}
	};
	protected ISODateTime valueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Rating
	 * Rating}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time as from which the rating is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Rating, ISODateTime> mmValueDate = new MMBusinessAttribute<Rating, ISODateTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Rating.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date/time as from which the rating is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Rating obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(Rating obj, ISODateTime value) {
			obj.setValueDate(value);
		}
	};
	protected RatingValueIdentifier value;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RatingValueIdentifier
	 * RatingValueIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Rating
	 * Rating}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70a::RATS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the rating, which has been assigned to a security by a rating agency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Rating, RatingValueIdentifier> mmValue = new MMBusinessAttribute<Rating, RatingValueIdentifier>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Rating.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70a::RATS"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Specifies the rating, which has been assigned to a security by a rating agency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RatingValueIdentifier.mmObject();
		}

		@Override
		public RatingValueIdentifier getValue(Rating obj) {
			return obj.getValue();
		}

		@Override
		public void setValue(Rating obj, RatingValueIdentifier value) {
			obj.setValue(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Rating";
				definition = "Assessment of securities credit and investment risk.";
				associationDomain_lazy = () -> Arrays.asList(Security.mmRating, Scheme.mmRating);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Rating.mmSecurity, com.tools20022.repository.entity.Rating.mmRatingScheme, com.tools20022.repository.entity.Rating.mmValueDate,
						com.tools20022.repository.entity.Rating.mmValue);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Rating.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Security> getSecurity() {
		return security == null ? Optional.empty() : Optional.of(security);
	}

	public Rating setSecurity(Security security) {
		this.security = security;
		return this;
	}

	public Scheme getRatingScheme() {
		return ratingScheme;
	}

	public Rating setRatingScheme(Scheme ratingScheme) {
		this.ratingScheme = Objects.requireNonNull(ratingScheme);
		return this;
	}

	public ISODateTime getValueDate() {
		return valueDate;
	}

	public Rating setValueDate(ISODateTime valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public RatingValueIdentifier getValue() {
		return value;
	}

	public Rating setValue(RatingValueIdentifier value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}
}
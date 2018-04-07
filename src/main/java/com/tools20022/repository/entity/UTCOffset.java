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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.entity.Location;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Offset of the time before or after 00:00 hour UTC.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UTCOffset" src="doc-files/UTCOffset.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.UTCOffset#mmSign
 * UTCOffset.mmSign}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UTCOffset#mmNumberOfHours
 * UTCOffset.mmNumberOfHours}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UTCOffset#mmLocation
 * UTCOffset.mmLocation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmTimeZone
 * Location.mmTimeZone}</li>
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
 * "UTCOffset"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Offset of the time before or after 00:00 hour UTC."</li>
 * </ul>
 */
public class UTCOffset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PlusOrMinusIndicator sign;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PlusOrMinusIndicator
	 * PlusOrMinusIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.UTCOffset
	 * UTCOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the offset is before or after 00:00 hour UTC."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<UTCOffset, PlusOrMinusIndicator> mmSign = new MMBusinessAttribute<UTCOffset, PlusOrMinusIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UTCOffset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sign";
			definition = "Indicates whether the offset is before or after 00:00 hour UTC.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}

		@Override
		public PlusOrMinusIndicator getValue(UTCOffset obj) {
			return obj.getSign();
		}

		@Override
		public void setValue(UTCOffset obj, PlusOrMinusIndicator value) {
			obj.setSign(value);
		}
	};
	protected ISOTime numberOfHours;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.UTCOffset
	 * UTCOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfHours"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Offset of the reporting time, in hours,  before or after 00:00 hour UTC."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<UTCOffset, ISOTime> mmNumberOfHours = new MMBusinessAttribute<UTCOffset, ISOTime>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UTCOffset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NumberOfHours";
			definition = "Offset of the reporting time, in hours,  before or after 00:00 hour UTC.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOTime.mmObject();
		}

		@Override
		public ISOTime getValue(UTCOffset obj) {
			return obj.getNumberOfHours();
		}

		@Override
		public void setValue(UTCOffset obj, ISOTime value) {
			obj.setNumberOfHours(value);
		}
	};
	protected Location location;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmTimeZone
	 * Location.mmTimeZone}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.UTCOffset
	 * UTCOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Location to which the time zone applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<UTCOffset, Location> mmLocation = new MMBusinessAssociationEnd<UTCOffset, Location>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UTCOffset.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location to which the time zone applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Location.mmTimeZone;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Location.mmObject();
		}

		@Override
		public Location getValue(UTCOffset obj) {
			return obj.getLocation();
		}

		@Override
		public void setValue(UTCOffset obj, Location value) {
			obj.setLocation(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UTCOffset";
				definition = "Offset of the time before or after 00:00 hour UTC.";
				associationDomain_lazy = () -> Arrays.asList(Location.mmTimeZone);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UTCOffset.mmSign, com.tools20022.repository.entity.UTCOffset.mmNumberOfHours, com.tools20022.repository.entity.UTCOffset.mmLocation);
			}

			@Override
			public Class<?> getInstanceClass() {
				return UTCOffset.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PlusOrMinusIndicator getSign() {
		return sign;
	}

	public UTCOffset setSign(PlusOrMinusIndicator sign) {
		this.sign = Objects.requireNonNull(sign);
		return this;
	}

	public ISOTime getNumberOfHours() {
		return numberOfHours;
	}

	public UTCOffset setNumberOfHours(ISOTime numberOfHours) {
		this.numberOfHours = Objects.requireNonNull(numberOfHours);
		return this;
	}

	public Location getLocation() {
		return location;
	}

	public UTCOffset setLocation(Location location) {
		this.location = Objects.requireNonNull(location);
		return this;
	}
}
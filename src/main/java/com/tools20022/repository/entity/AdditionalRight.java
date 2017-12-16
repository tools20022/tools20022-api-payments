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
import com.tools20022.repository.codeset.AdditionalRightCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies how the additional rights can be granted to the shareholder. These
 * rights can be exercised at shareholders meetings (for example, the right to
 * ask questions, the right to add items to the agenda or table draft
 * resolutions).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AdditionalRight" src="doc-files/AdditionalRight.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AdditionalRight#mmMeeting
 * AdditionalRight.mmMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AdditionalRight#mmType
 * AdditionalRight.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AdditionalRight#mmAdditionalRightThreshold
 * AdditionalRight.mmAdditionalRightThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AdditionalRight#mmAdditionalRightThresholdPercentage
 * AdditionalRight.mmAdditionalRightThresholdPercentage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmAdditionalRight
 * Meeting.mmAdditionalRight}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalRight"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies how the additional rights can be granted to the shareholder. These rights can be exercised at shareholders meetings (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions)."
 * </li>
 * </ul>
 */
public class AdditionalRight {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Meeting meeting;
	/**
	 * Meeting for which additional rights are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmAdditionalRight
	 * Meeting.mmAdditionalRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AdditionalRight
	 * AdditionalRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which additional rights are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AdditionalRight.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which additional rights are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmAdditionalRight;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};
	protected AdditionalRightCode type;
	/**
	 * Specifies the additional right type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalRightCode
	 * AdditionalRightCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AdditionalRight
	 * AdditionalRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the additional right type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AdditionalRight.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the additional right type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdditionalRightCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AdditionalRight.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text additionalRightThreshold;
	/**
	 * Additional right granted to specify the minimum stake in share capital or
	 * cash value or number of security holders required to table resolutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AdditionalRight
	 * AdditionalRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional right granted to specify the minimum stake in share capital or cash value or number of security holders required to table resolutions."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAdditionalRightThreshold = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AdditionalRight.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalRightThreshold";
			definition = "Additional right granted to specify the minimum stake in share capital or cash value or number of security holders required to table resolutions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AdditionalRight.class.getMethod("getAdditionalRightThreshold", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate additionalRightThresholdPercentage;
	/**
	 * Additional right granted to specify the minimum stake in share capital or
	 * cash value or number of security holders required to table resolutions.
	 * This minimum is expressed as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AdditionalRight
	 * AdditionalRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightThresholdPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional right granted to specify the minimum stake in share capital or cash value or number of security holders required to table resolutions. This minimum is expressed as a percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAdditionalRightThresholdPercentage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AdditionalRight.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalRightThresholdPercentage";
			definition = "Additional right granted to specify the minimum stake in share capital or cash value or number of security holders required to table resolutions. This minimum is expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AdditionalRight.class.getMethod("getAdditionalRightThresholdPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalRight";
				definition = "Specifies how the additional rights can be granted to the shareholder. These rights can be exercised at shareholders meetings (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.mmAdditionalRight);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AdditionalRight.mmMeeting, com.tools20022.repository.entity.AdditionalRight.mmType,
						com.tools20022.repository.entity.AdditionalRight.mmAdditionalRightThreshold, com.tools20022.repository.entity.AdditionalRight.mmAdditionalRightThresholdPercentage);
			}

			@Override
			public Class<?> getInstanceClass() {
				return AdditionalRight.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Meeting getMeeting() {
		return meeting;
	}

	public void setMeeting(com.tools20022.repository.entity.Meeting meeting) {
		this.meeting = meeting;
	}

	public AdditionalRightCode getType() {
		return type;
	}

	public void setType(AdditionalRightCode type) {
		this.type = type;
	}

	public Max350Text getAdditionalRightThreshold() {
		return additionalRightThreshold;
	}

	public void setAdditionalRightThreshold(Max350Text additionalRightThreshold) {
		this.additionalRightThreshold = additionalRightThreshold;
	}

	public PercentageRate getAdditionalRightThresholdPercentage() {
		return additionalRightThresholdPercentage;
	}

	public void setAdditionalRightThresholdPercentage(PercentageRate additionalRightThresholdPercentage) {
		this.additionalRightThresholdPercentage = additionalRightThresholdPercentage;
	}
}
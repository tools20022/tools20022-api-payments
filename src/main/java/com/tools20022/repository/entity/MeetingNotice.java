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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.MeetingServicing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Information about the general meeting, specifying the participation
 * requirements and the voting procedures. Alternatively, it may indicate where
 * such information may be obtained.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MeetingNotice" src="doc-files/MeetingNotice.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingNotice#mmRelatedServicing
 * MeetingNotice.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingNotice#mmBeneficialOwnerExclusiveIndicator
 * MeetingNotice.mmBeneficialOwnerExclusiveIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingNotice
 * MeetingServicing.mmMeetingNotice}</li>
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
 * "MeetingNotice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained."
 * </li>
 * </ul>
 */
public class MeetingNotice {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected MeetingServicing relatedServicing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.MeetingServicing#mmMeetingNotice
	 * MeetingServicing.mmMeetingNotice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.MeetingServicing
	 * MeetingServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingNotice MeetingNotice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Meeting servicing process which comprises the notification of a meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<MeetingNotice, Optional<MeetingServicing>> mmRelatedServicing = new MMBusinessAssociationEnd<MeetingNotice, Optional<MeetingServicing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingNotice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Meeting servicing process which comprises the notification of a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> MeetingServicing.mmMeetingNotice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> MeetingServicing.mmObject();
		}

		@Override
		public Optional<MeetingServicing> getValue(MeetingNotice obj) {
			return obj.getRelatedServicing();
		}

		@Override
		public void setValue(MeetingNotice obj, Optional<MeetingServicing> value) {
			obj.setRelatedServicing(value.orElse(null));
		}
	};
	protected YesNoIndicator beneficialOwnerExclusiveIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MeetingNotice MeetingNotice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerExclusiveIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that only the beneficial owner may participate in the event, ie no proxy or nominee voting is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<MeetingNotice, YesNoIndicator> mmBeneficialOwnerExclusiveIndicator = new MMBusinessAttribute<MeetingNotice, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MeetingNotice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnerExclusiveIndicator";
			definition = "Indicates that only the beneficial owner may participate in the event, ie no proxy or nominee voting is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(MeetingNotice obj) {
			return obj.getBeneficialOwnerExclusiveIndicator();
		}

		@Override
		public void setValue(MeetingNotice obj, YesNoIndicator value) {
			obj.setBeneficialOwnerExclusiveIndicator(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingNotice";
				definition = "Information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained.";
				associationDomain_lazy = () -> Arrays.asList(MeetingServicing.mmMeetingNotice);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MeetingNotice.mmRelatedServicing, com.tools20022.repository.entity.MeetingNotice.mmBeneficialOwnerExclusiveIndicator);
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingNotice.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<MeetingServicing> getRelatedServicing() {
		return relatedServicing == null ? Optional.empty() : Optional.of(relatedServicing);
	}

	public MeetingNotice setRelatedServicing(MeetingServicing relatedServicing) {
		this.relatedServicing = relatedServicing;
		return this;
	}

	public YesNoIndicator getBeneficialOwnerExclusiveIndicator() {
		return beneficialOwnerExclusiveIndicator;
	}

	public MeetingNotice setBeneficialOwnerExclusiveIndicator(YesNoIndicator beneficialOwnerExclusiveIndicator) {
		this.beneficialOwnerExclusiveIndicator = Objects.requireNonNull(beneficialOwnerExclusiveIndicator);
		return this;
	}
}
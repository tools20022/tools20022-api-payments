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
import com.tools20022.repository.codeset.PriorityCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SystemBusinessInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Further qualifies the information provided in terms of its importance and its
 * format.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InformationQualifier" src="doc-files/InformationQualifier.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationQualifier#mmSystemBusinessInformation
 * InformationQualifier.mmSystemBusinessInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationQualifier#mmIsFormatted
 * InformationQualifier.mmIsFormatted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationQualifier#mmPriority
 * InformationQualifier.mmPriority}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmQualifier
 * SystemBusinessInformation.mmQualifier}</li>
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
 * "InformationQualifier"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further qualifies the information provided in terms of its importance and its format."
 * </li>
 * </ul>
 */
public class InformationQualifier {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SystemBusinessInformation systemBusinessInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmQualifier
	 * SystemBusinessInformation.mmQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InformationQualifier
	 * InformationQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemBusinessInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which a qualifier is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<InformationQualifier, SystemBusinessInformation> mmSystemBusinessInformation = new MMBusinessAssociationEnd<InformationQualifier, SystemBusinessInformation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InformationQualifier.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystemBusinessInformation";
			definition = "System for which a qualifier is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SystemBusinessInformation.mmQualifier;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SystemBusinessInformation.mmObject();
		}

		@Override
		public SystemBusinessInformation getValue(InformationQualifier obj) {
			return obj.getSystemBusinessInformation();
		}

		@Override
		public void setValue(InformationQualifier obj, SystemBusinessInformation value) {
			obj.setSystemBusinessInformation(value);
		}
	};
	protected YesNoIndicator isFormatted;
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
	 * {@linkplain com.tools20022.repository.entity.InformationQualifier
	 * InformationQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IsFormatted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the information is formatted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InformationQualifier, YesNoIndicator> mmIsFormatted = new MMBusinessAttribute<InformationQualifier, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InformationQualifier.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IsFormatted";
			definition = "Indicates whether the information is formatted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(InformationQualifier obj) {
			return obj.getIsFormatted();
		}

		@Override
		public void setValue(InformationQualifier obj, YesNoIndicator value) {
			obj.setIsFormatted(value);
		}
	};
	protected PriorityCode priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PriorityCode
	 * PriorityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InformationQualifier
	 * InformationQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Priority of the information."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<InformationQualifier, PriorityCode> mmPriority = new MMBusinessAttribute<InformationQualifier, PriorityCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InformationQualifier.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Priority";
			definition = "Priority of the information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriorityCode.mmObject();
		}

		@Override
		public PriorityCode getValue(InformationQualifier obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(InformationQualifier obj, PriorityCode value) {
			obj.setPriority(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InformationQualifier";
				definition = "Further qualifies the information provided in terms of its importance and its format.";
				associationDomain_lazy = () -> Arrays.asList(SystemBusinessInformation.mmQualifier);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InformationQualifier.mmSystemBusinessInformation, com.tools20022.repository.entity.InformationQualifier.mmIsFormatted,
						com.tools20022.repository.entity.InformationQualifier.mmPriority);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InformationQualifier.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SystemBusinessInformation getSystemBusinessInformation() {
		return systemBusinessInformation;
	}

	public InformationQualifier setSystemBusinessInformation(SystemBusinessInformation systemBusinessInformation) {
		this.systemBusinessInformation = Objects.requireNonNull(systemBusinessInformation);
		return this;
	}

	public YesNoIndicator getIsFormatted() {
		return isFormatted;
	}

	public InformationQualifier setIsFormatted(YesNoIndicator isFormatted) {
		this.isFormatted = Objects.requireNonNull(isFormatted);
		return this;
	}

	public PriorityCode getPriority() {
		return priority;
	}

	public InformationQualifier setPriority(PriorityCode priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}
}
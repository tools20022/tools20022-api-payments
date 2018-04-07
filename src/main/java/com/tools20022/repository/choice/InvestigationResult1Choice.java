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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.InvestigationStatus1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.other.SupplementaryDataEnvelope1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the investigation results.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationResult1Choice#mmResult
 * InvestigationResult1Choice.mmResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InvestigationResult1Choice#mmInvestigationStatus
 * InvestigationResult1Choice.mmInvestigationStatus}</li>
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
 * "InvestigationResult1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the investigation results."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestigationResult1Choice", propOrder = {"result", "investigationStatus"})
public class InvestigationResult1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rslt", required = true)
	protected SupplementaryDataEnvelope1 result;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.other.SupplementaryDataEnvelope1
	 * SupplementaryDataEnvelope1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationResult1Choice
	 * InvestigationResult1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Result"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the result."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestigationResult1Choice, SupplementaryDataEnvelope1> mmResult = new MMMessageAttribute<InvestigationResult1Choice, SupplementaryDataEnvelope1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.InvestigationResult1Choice.mmObject();
			isDerived = false;
			xmlTag = "Rslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Result";
			definition = "Provides the result.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SupplementaryDataEnvelope1.mmObject();
		}

		@Override
		public SupplementaryDataEnvelope1 getValue(InvestigationResult1Choice obj) {
			return obj.getResult();
		}

		@Override
		public void setValue(InvestigationResult1Choice obj, SupplementaryDataEnvelope1 value) {
			obj.setResult(value);
		}
	};
	@XmlElement(name = "InvstgtnSts", required = true)
	protected InvestigationStatus1Code investigationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InvestigationStatus1Code
	 * InvestigationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InvestigationResult1Choice
	 * InvestigationResult1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstgtnSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the investigation status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestigationResult1Choice, InvestigationStatus1Code> mmInvestigationStatus = new MMMessageAttribute<InvestigationResult1Choice, InvestigationStatus1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.InvestigationResult1Choice.mmObject();
			isDerived = false;
			xmlTag = "InvstgtnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationStatus";
			definition = "Provides the investigation status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InvestigationStatus1Code.mmObject();
		}

		@Override
		public InvestigationStatus1Code getValue(InvestigationResult1Choice obj) {
			return obj.getInvestigationStatus();
		}

		@Override
		public void setValue(InvestigationResult1Choice obj, InvestigationStatus1Code value) {
			obj.setInvestigationStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InvestigationResult1Choice.mmResult, com.tools20022.repository.choice.InvestigationResult1Choice.mmInvestigationStatus);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestigationResult1Choice";
				definition = "Provides the investigation results.";
			}
		});
		return mmObject_lazy.get();
	}

	public SupplementaryDataEnvelope1 getResult() {
		return result;
	}

	public InvestigationResult1Choice setResult(SupplementaryDataEnvelope1 result) {
		this.result = Objects.requireNonNull(result);
		return this;
	}

	public InvestigationStatus1Code getInvestigationStatus() {
		return investigationStatus;
	}

	public InvestigationResult1Choice setInvestigationStatus(InvestigationStatus1Code investigationStatus) {
		this.investigationStatus = Objects.requireNonNull(investigationStatus);
		return this;
	}
}
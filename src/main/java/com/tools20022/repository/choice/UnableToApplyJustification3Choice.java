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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.UnableToApplyV05;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MissingOrIncorrectInformation3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the details of missing or incorrect information or the complete set
 * of available information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustification3Choice#mmAnyInformation
 * UnableToApplyJustification3Choice.mmAnyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustification3Choice#mmMissingOrIncorrectInformation
 * UnableToApplyJustification3Choice.mmMissingOrIncorrectInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustification3Choice#mmPossibleDuplicateInstruction
 * UnableToApplyJustification3Choice.mmPossibleDuplicateInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.UnableToApplyV05#mmJustification
 * UnableToApplyV05.mmJustification}</li>
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
 * "UnableToApplyJustification3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details of missing or incorrect information or the complete set of available information."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnableToApplyJustification3Choice", propOrder = {"anyInformation", "missingOrIncorrectInformation", "possibleDuplicateInstruction"})
public class UnableToApplyJustification3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AnyInf", required = true)
	protected YesNoIndicator anyInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustification3Choice
	 * UnableToApplyJustification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnyInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not all available information on the underlying payment instruction is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAnyInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UnableToApplyJustification3Choice.mmObject();
			isDerived = false;
			xmlTag = "AnyInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyInformation";
			definition = "Indicates whether or not all available information on the underlying payment instruction is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "MssngOrIncrrctInf", required = true)
	protected MissingOrIncorrectInformation3 missingOrIncorrectInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation3
	 * MissingOrIncorrectInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustification3Choice
	 * UnableToApplyJustification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MssngOrIncrrctInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingOrIncorrectInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to indicate which information is missing or incorrect."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMissingOrIncorrectInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UnableToApplyJustification3Choice.mmObject();
			isDerived = false;
			xmlTag = "MssngOrIncrrctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOrIncorrectInformation";
			definition = "Set of elements used to indicate which information is missing or incorrect.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MissingOrIncorrectInformation3.mmObject();
		}
	};
	@XmlElement(name = "PssblDplctInstr", required = true)
	protected TrueFalseIndicator possibleDuplicateInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnableToApplyJustification3Choice
	 * UnableToApplyJustification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PssblDplctInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicateInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the referred item is a possible duplicate of a previous instruction or entry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPossibleDuplicateInstruction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.UnableToApplyJustification3Choice.mmObject();
			isDerived = false;
			xmlTag = "PssblDplctInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicateInstruction";
			definition = "Indicates whether or not the referred item is a possible duplicate of a previous instruction or entry.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.UnableToApplyJustification3Choice.mmAnyInformation,
						com.tools20022.repository.choice.UnableToApplyJustification3Choice.mmMissingOrIncorrectInformation, com.tools20022.repository.choice.UnableToApplyJustification3Choice.mmPossibleDuplicateInstruction);
				messageBuildingBlock_lazy = () -> Arrays.asList(UnableToApplyV05.mmJustification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyJustification3Choice";
				definition = "Specifies the details of missing or incorrect information or the complete set of available information.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getAnyInformation() {
		return anyInformation;
	}

	public UnableToApplyJustification3Choice setAnyInformation(YesNoIndicator anyInformation) {
		this.anyInformation = Objects.requireNonNull(anyInformation);
		return this;
	}

	public MissingOrIncorrectInformation3 getMissingOrIncorrectInformation() {
		return missingOrIncorrectInformation;
	}

	public UnableToApplyJustification3Choice setMissingOrIncorrectInformation(MissingOrIncorrectInformation3 missingOrIncorrectInformation) {
		this.missingOrIncorrectInformation = Objects.requireNonNull(missingOrIncorrectInformation);
		return this;
	}

	public TrueFalseIndicator getPossibleDuplicateInstruction() {
		return possibleDuplicateInstruction;
	}

	public UnableToApplyJustification3Choice setPossibleDuplicateInstruction(TrueFalseIndicator possibleDuplicateInstruction) {
		this.possibleDuplicateInstruction = Objects.requireNonNull(possibleDuplicateInstruction);
		return this;
	}
}
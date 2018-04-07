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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the details of incorrect information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnableToApplyIncorrect1#mmCode
 * UnableToApplyIncorrect1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnableToApplyIncorrect1#mmAdditionalIncorrectInformation
 * UnableToApplyIncorrect1.mmAdditionalIncorrectInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalIncorrectInformationRule#forUnableToApplyIncorrect1
 * ConstraintAdditionalIncorrectInformationRule.forUnableToApplyIncorrect1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnableToApplyIncorrect1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the details of incorrect information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnableToApplyIncorrect1", propOrder = {"code", "additionalIncorrectInformation"})
public class UnableToApplyIncorrect1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected UnableToApplyIncorrectInformation4Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInformation4Code
	 * UnableToApplyIncorrectInformation4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnableToApplyIncorrect1
	 * UnableToApplyIncorrect1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the missing information in a coded form."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnableToApplyIncorrect1, UnableToApplyIncorrectInformation4Code> mmCode = new MMMessageAttribute<UnableToApplyIncorrect1, UnableToApplyIncorrectInformation4Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UnableToApplyIncorrect1.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Specifies the missing information in a coded form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnableToApplyIncorrectInformation4Code.mmObject();
		}

		@Override
		public UnableToApplyIncorrectInformation4Code getValue(UnableToApplyIncorrect1 obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(UnableToApplyIncorrect1 obj, UnableToApplyIncorrectInformation4Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "AddtlIncrrctInf")
	protected Max140Text additionalIncorrectInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnableToApplyIncorrect1
	 * UnableToApplyIncorrect1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlIncrrctInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalIncorrectInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details about the incorrect information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UnableToApplyIncorrect1, Optional<Max140Text>> mmAdditionalIncorrectInformation = new MMMessageAttribute<UnableToApplyIncorrect1, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UnableToApplyIncorrect1.mmObject();
			isDerived = false;
			xmlTag = "AddtlIncrrctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalIncorrectInformation";
			definition = "Further details about the incorrect information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(UnableToApplyIncorrect1 obj) {
			return obj.getAdditionalIncorrectInformation();
		}

		@Override
		public void setValue(UnableToApplyIncorrect1 obj, Optional<Max140Text> value) {
			obj.setAdditionalIncorrectInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnableToApplyIncorrect1.mmCode, com.tools20022.repository.msg.UnableToApplyIncorrect1.mmAdditionalIncorrectInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalIncorrectInformationRule.forUnableToApplyIncorrect1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnableToApplyIncorrect1";
				definition = "Specifies the details of incorrect information.";
			}
		});
		return mmObject_lazy.get();
	}

	public UnableToApplyIncorrectInformation4Code getCode() {
		return code;
	}

	public UnableToApplyIncorrect1 setCode(UnableToApplyIncorrectInformation4Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public Optional<Max140Text> getAdditionalIncorrectInformation() {
		return additionalIncorrectInformation == null ? Optional.empty() : Optional.of(additionalIncorrectInformation);
	}

	public UnableToApplyIncorrect1 setAdditionalIncorrectInformation(Max140Text additionalIncorrectInformation) {
		this.additionalIncorrectInformation = additionalIncorrectInformation;
		return this;
	}
}
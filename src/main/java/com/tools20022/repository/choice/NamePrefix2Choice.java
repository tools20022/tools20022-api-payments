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
import com.tools20022.repository.codeset.NamePrefix1Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Prefix used for name.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NamePrefix2Choice#mmNamePrefix
 * NamePrefix2Choice.mmNamePrefix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NamePrefix2Choice#mmExtendedNamePrefix
 * NamePrefix2Choice.mmExtendedNamePrefix}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NamePrefix2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Prefix used for name."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NamePrefix2Choice", propOrder = {"namePrefix", "extendedNamePrefix"})
public class NamePrefix2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NmPrfx", required = true)
	protected NamePrefix1Code namePrefix;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NamePrefix2Choice
	 * NamePrefix2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmPrfx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NamePrefix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Prefix for name."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NamePrefix2Choice, NamePrefix1Code> mmNamePrefix = new MMMessageAttribute<NamePrefix2Choice, NamePrefix1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.NamePrefix2Choice.mmObject();
			isDerived = false;
			xmlTag = "NmPrfx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NamePrefix";
			definition = "Prefix for name.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NamePrefix1Code.mmObject();
		}

		@Override
		public NamePrefix1Code getValue(NamePrefix2Choice obj) {
			return obj.getNamePrefix();
		}

		@Override
		public void setValue(NamePrefix2Choice obj, NamePrefix1Code value) {
			obj.setNamePrefix(value);
		}
	};
	@XmlElement(name = "XtndedNmPrfx", required = true)
	protected Extended350Code extendedNamePrefix;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NamePrefix2Choice
	 * NamePrefix2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedNmPrfx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedNamePrefix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name prefix that is extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NamePrefix2Choice, Extended350Code> mmExtendedNamePrefix = new MMMessageAttribute<NamePrefix2Choice, Extended350Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.NamePrefix2Choice.mmObject();
			isDerived = false;
			xmlTag = "XtndedNmPrfx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedNamePrefix";
			definition = "Name prefix that is extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Extended350Code getValue(NamePrefix2Choice obj) {
			return obj.getExtendedNamePrefix();
		}

		@Override
		public void setValue(NamePrefix2Choice obj, Extended350Code value) {
			obj.setExtendedNamePrefix(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.NamePrefix2Choice.mmNamePrefix, com.tools20022.repository.choice.NamePrefix2Choice.mmExtendedNamePrefix);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NamePrefix2Choice";
				definition = "Prefix used for name.";
			}
		});
		return mmObject_lazy.get();
	}

	public NamePrefix1Code getNamePrefix() {
		return namePrefix;
	}

	public NamePrefix2Choice setNamePrefix(NamePrefix1Code namePrefix) {
		this.namePrefix = Objects.requireNonNull(namePrefix);
		return this;
	}

	public Extended350Code getExtendedNamePrefix() {
		return extendedNamePrefix;
	}

	public NamePrefix2Choice setExtendedNamePrefix(Extended350Code extendedNamePrefix) {
		this.extendedNamePrefix = Objects.requireNonNull(extendedNamePrefix);
		return this;
	}
}
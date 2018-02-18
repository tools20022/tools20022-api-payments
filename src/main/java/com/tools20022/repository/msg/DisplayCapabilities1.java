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
import com.tools20022.repository.codeset.UserInterface2Code;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The capabilities of the display components performing the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities1#mmDisplayType
 * DisplayCapabilities1.mmDisplayType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities1#mmNumberOfLines
 * DisplayCapabilities1.mmNumberOfLines}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities1#mmLineWidth
 * DisplayCapabilities1.mmLineWidth}</li>
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
 * "DisplayCapabilities1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The capabilities of the display components performing the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DisplayCapabilities1", propOrder = {"displayType", "numberOfLines", "lineWidth"})
public class DisplayCapabilities1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DispTp", required = true)
	protected UserInterface2Code displayType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface2Code
	 * UserInterface2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities1
	 * DisplayCapabilities1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DispTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of display (for example merchant or cardholder)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDisplayType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities1.mmObject();
			isDerived = false;
			xmlTag = "DispTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisplayType";
			definition = "Type of display (for example merchant or cardholder).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UserInterface2Code.mmObject();
		}
	};
	@XmlElement(name = "NbOfLines", required = true)
	protected Max3NumericText numberOfLines;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities1
	 * DisplayCapabilities1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfLines"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfLines"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of lines of the display component."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfLines = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities1.mmObject();
			isDerived = false;
			xmlTag = "NbOfLines";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfLines";
			definition = "Number of lines of the display component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	@XmlElement(name = "LineWidth", required = true)
	protected Max3NumericText lineWidth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DisplayCapabilities1
	 * DisplayCapabilities1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineWidth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of columns of the display component."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLineWidth = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DisplayCapabilities1.mmObject();
			isDerived = false;
			xmlTag = "LineWidth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineWidth";
			definition = "Number of columns of the display component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DisplayCapabilities1.mmDisplayType, com.tools20022.repository.msg.DisplayCapabilities1.mmNumberOfLines,
						com.tools20022.repository.msg.DisplayCapabilities1.mmLineWidth);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisplayCapabilities1";
				definition = "The capabilities of the display components performing the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public UserInterface2Code getDisplayType() {
		return displayType;
	}

	public DisplayCapabilities1 setDisplayType(UserInterface2Code displayType) {
		this.displayType = Objects.requireNonNull(displayType);
		return this;
	}

	public Max3NumericText getNumberOfLines() {
		return numberOfLines;
	}

	public DisplayCapabilities1 setNumberOfLines(Max3NumericText numberOfLines) {
		this.numberOfLines = Objects.requireNonNull(numberOfLines);
		return this;
	}

	public Max3NumericText getLineWidth() {
		return lineWidth;
	}

	public DisplayCapabilities1 setLineWidth(Max3NumericText lineWidth) {
		this.lineWidth = Objects.requireNonNull(lineWidth);
		return this;
	}
}
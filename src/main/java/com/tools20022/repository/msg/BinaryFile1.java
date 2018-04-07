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
import com.tools20022.repository.datatype.Max100KBinary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Computer file stored in a binary format.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BinaryFile1#mmMIMEType
 * BinaryFile1.mmMIMEType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BinaryFile1#mmEncodingType
 * BinaryFile1.mmEncodingType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BinaryFile1#mmCharacterSet
 * BinaryFile1.mmCharacterSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BinaryFile1#mmIncludedBinaryObject
 * BinaryFile1.mmIncludedBinaryObject}</li>
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
 * "BinaryFile1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Computer file stored in a binary format."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BinaryFile1", propOrder = {"mIMEType", "encodingType", "characterSet", "includedBinaryObject"})
public class BinaryFile1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MIMETp")
	protected Max35Text mIMEType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BinaryFile1 BinaryFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MIMETp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MIMEType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code specifying the Multipurpose Internet Mail Extensions (MIME) type for this attached binary file. Reference IANA (Internet Assigned Numbers Authority) - MIME Media Types (www.iana.org/assignments/media-types)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BinaryFile1, Optional<Max35Text>> mmMIMEType = new MMMessageAttribute<BinaryFile1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BinaryFile1.mmObject();
			isDerived = false;
			xmlTag = "MIMETp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MIMEType";
			definition = "Code specifying the Multipurpose Internet Mail Extensions (MIME) type for this attached binary file. Reference IANA (Internet Assigned Numbers Authority) - MIME Media Types (www.iana.org/assignments/media-types).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(BinaryFile1 obj) {
			return obj.getMIMEType();
		}

		@Override
		public void setValue(BinaryFile1 obj, Optional<Max35Text> value) {
			obj.setMIMEType(value.orElse(null));
		}
	};
	@XmlElement(name = "NcodgTp")
	protected Max35Text encodingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BinaryFile1 BinaryFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcodgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncodingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the encoding algorithm used for this attached binary file. Reference IANA (Internet Assigned Numbers Authority) - Transfer Encodings (www.iana.org/assignments/transfer-encodings)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BinaryFile1, Optional<Max35Text>> mmEncodingType = new MMMessageAttribute<BinaryFile1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BinaryFile1.mmObject();
			isDerived = false;
			xmlTag = "NcodgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncodingType";
			definition = "Specifies the encoding algorithm used for this attached binary file. Reference IANA (Internet Assigned Numbers Authority) - Transfer Encodings (www.iana.org/assignments/transfer-encodings).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(BinaryFile1 obj) {
			return obj.getEncodingType();
		}

		@Override
		public void setValue(BinaryFile1 obj, Optional<Max35Text> value) {
			obj.setEncodingType(value.orElse(null));
		}
	};
	@XmlElement(name = "CharSet")
	protected Max35Text characterSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BinaryFile1 BinaryFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CharSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CharacterSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a code signifying the particular character set used for this attached binary file. Reference IANA (Internet Assigned Numbers Authority) - Character Sets (www.iana.org/assignments/character-sets)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BinaryFile1, Optional<Max35Text>> mmCharacterSet = new MMMessageAttribute<BinaryFile1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BinaryFile1.mmObject();
			isDerived = false;
			xmlTag = "CharSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CharacterSet";
			definition = "Specifies a code signifying the particular character set used for this attached binary file. Reference IANA (Internet Assigned Numbers Authority) - Character Sets (www.iana.org/assignments/character-sets).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(BinaryFile1 obj) {
			return obj.getCharacterSet();
		}

		@Override
		public void setValue(BinaryFile1 obj, Optional<Max35Text> value) {
			obj.setCharacterSet(value.orElse(null));
		}
	};
	@XmlElement(name = "InclBinryObjct")
	protected Max100KBinary includedBinaryObject;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max100KBinary
	 * Max100KBinary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BinaryFile1 BinaryFile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InclBinryObjct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncludedBinaryObject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Binary object included in this attached binary file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BinaryFile1, Optional<Max100KBinary>> mmIncludedBinaryObject = new MMMessageAttribute<BinaryFile1, Optional<Max100KBinary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BinaryFile1.mmObject();
			isDerived = false;
			xmlTag = "InclBinryObjct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncludedBinaryObject";
			definition = "Binary object included in this attached binary file.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max100KBinary.mmObject();
		}

		@Override
		public Optional<Max100KBinary> getValue(BinaryFile1 obj) {
			return obj.getIncludedBinaryObject();
		}

		@Override
		public void setValue(BinaryFile1 obj, Optional<Max100KBinary> value) {
			obj.setIncludedBinaryObject(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BinaryFile1.mmMIMEType, com.tools20022.repository.msg.BinaryFile1.mmEncodingType, com.tools20022.repository.msg.BinaryFile1.mmCharacterSet,
						com.tools20022.repository.msg.BinaryFile1.mmIncludedBinaryObject);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BinaryFile1";
				definition = "Computer file stored in a binary format.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMIMEType() {
		return mIMEType == null ? Optional.empty() : Optional.of(mIMEType);
	}

	public BinaryFile1 setMIMEType(Max35Text mIMEType) {
		this.mIMEType = mIMEType;
		return this;
	}

	public Optional<Max35Text> getEncodingType() {
		return encodingType == null ? Optional.empty() : Optional.of(encodingType);
	}

	public BinaryFile1 setEncodingType(Max35Text encodingType) {
		this.encodingType = encodingType;
		return this;
	}

	public Optional<Max35Text> getCharacterSet() {
		return characterSet == null ? Optional.empty() : Optional.of(characterSet);
	}

	public BinaryFile1 setCharacterSet(Max35Text characterSet) {
		this.characterSet = characterSet;
		return this;
	}

	public Optional<Max100KBinary> getIncludedBinaryObject() {
		return includedBinaryObject == null ? Optional.empty() : Optional.of(includedBinaryObject);
	}

	public BinaryFile1 setIncludedBinaryObject(Max100KBinary includedBinaryObject) {
		this.includedBinaryObject = includedBinaryObject;
		return this;
	}
}
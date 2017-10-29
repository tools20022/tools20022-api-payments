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
import com.tools20022.repository.datatype.Max100KBinary;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Computer file stored in a binary format.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BinaryFile1#MIMEType
 * BinaryFile1.MIMEType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BinaryFile1#EncodingType
 * BinaryFile1.EncodingType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BinaryFile1#CharacterSet
 * BinaryFile1.CharacterSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BinaryFile1#IncludedBinaryObject
 * BinaryFile1.IncludedBinaryObject}</li>
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
public class BinaryFile1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code specifying the Multipurpose Internet Mail Extensions (MIME) type for
	 * this attached binary file. Reference IANA (Internet Assigned Numbers
	 * Authority) - MIME Media Types (www.iana.org/assignments/media-types).
	 * <p>
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
	public static final MMMessageAttribute MIMEType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BinaryFile1.mmObject();
			isDerived = false;
			xmlTag = "MIMETp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MIMEType";
			definition = "Code specifying the Multipurpose Internet Mail Extensions (MIME) type for this attached binary file. Reference IANA (Internet Assigned Numbers Authority) - MIME Media Types (www.iana.org/assignments/media-types).";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the encoding algorithm used for this attached binary file.
	 * Reference IANA (Internet Assigned Numbers Authority) - Transfer Encodings
	 * (www.iana.org/assignments/transfer-encodings).
	 * <p>
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
	public static final MMMessageAttribute EncodingType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BinaryFile1.mmObject();
			isDerived = false;
			xmlTag = "NcodgTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncodingType";
			definition = "Specifies the encoding algorithm used for this attached binary file. Reference IANA (Internet Assigned Numbers Authority) - Transfer Encodings (www.iana.org/assignments/transfer-encodings).";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies a code signifying the particular character set used for this
	 * attached binary file. Reference IANA (Internet Assigned Numbers
	 * Authority) - Character Sets (www.iana.org/assignments/character-sets).
	 * <p>
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
	public static final MMMessageAttribute CharacterSet = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BinaryFile1.mmObject();
			isDerived = false;
			xmlTag = "CharSet";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CharacterSet";
			definition = "Specifies a code signifying the particular character set used for this attached binary file. Reference IANA (Internet Assigned Numbers Authority) - Character Sets (www.iana.org/assignments/character-sets).";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Binary object included in this attached binary file.
	 * <p>
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
	public static final MMMessageAttribute IncludedBinaryObject = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BinaryFile1.mmObject();
			isDerived = false;
			xmlTag = "InclBinryObjct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncludedBinaryObject";
			definition = "Binary object included in this attached binary file.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max100KBinary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BinaryFile1.MIMEType, com.tools20022.repository.msg.BinaryFile1.EncodingType, com.tools20022.repository.msg.BinaryFile1.CharacterSet,
						com.tools20022.repository.msg.BinaryFile1.IncludedBinaryObject);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BinaryFile1";
				definition = "Computer file stored in a binary format.";
			}
		});
		return mmObject_lazy.get();
	}
}